class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int i = 0;i<n;i++){
            int distance = 0;
            int x = points[i][0];
            int y = points[i][1];

            distance = x*x + y*y;

            map.put(i,distance);
            
        }
        for(int num : map.keySet()){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[][] result = new int[k][2];
        for(int i = 0;i< result.length;i++){
            int index = pq.poll();
            result[i] = points[index];

        }
        return result;
        
    }
}