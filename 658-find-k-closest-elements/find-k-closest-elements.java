class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int distanceA = Math.abs(arr[a] - x);
            int distanceB = Math.abs(arr[b] - x);
            if( distanceA != distanceB){
                return distanceB - distanceA;
            }
            return arr[b] - arr[a];
            
        });

        for(int i = 0;i<n;i++){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<k;i++){
            int num = arr[pq.poll()];
            ans.add(num);
        }
        Collections.sort(ans);
        return ans;
         
    }
}