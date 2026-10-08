class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        ArrayList<int[]> projects = new ArrayList<>();
        for(int i = 0;i<capital.length;i++){
            projects.add(new int[]{capital[i],profits[i]});
        }
        projects.sort((a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        while( k != 0){
            while( i < projects.size() && projects.get(i)[0] <= w){
                pq.add(projects.get(i)[1]);
                i++;
            }
            if(pq.isEmpty()){
                break;
            }
            int maxprofit = pq.poll();
            w += maxprofit;
            k--;
        }
        return w;
        
    }
}