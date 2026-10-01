class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>( (a,b) -> map.get(a) - map.get(b));
        for(int i = 0;i<n;i++){
           if(map.containsKey(nums[i])){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           }else{
            map.put(nums[i],1);
           }
        }
        for(int num : map.keySet()){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int size = pq.size();
        int[] result = new int[pq.size()];
        for(int i = 0;i< size;i++){
            result[i] = pq.poll();
        }
        return result;
    
        
    }
}