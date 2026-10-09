class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < n;i++){
            pq.add(stones[i]);
        }
        while(pq.size() > 1){
            int firstlarge = pq.poll();
            int secondlarge = pq.poll();
            if(firstlarge == secondlarge){
                continue;
            }else if( firstlarge > secondlarge){
                int diff = firstlarge - secondlarge ;
                pq.offer(diff);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
        
        
    }
}