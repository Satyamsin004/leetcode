class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
           if(a[1] != b[1]){
            return b[1] - a[1];
           }
           return b[0] - a[0];
        });
        for(int i = 0;i<n;i++){
           int count = 0;
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            pq.add(new int[]{i,count});
            if(pq.size() > k){
                pq.poll();
            }
            
        }
        int[] result = new int[k];
        for(int i = k - 1;i >= 0;i--){
            result[i] = pq.poll()[0];
            
        }
        return result;
        
    }
}