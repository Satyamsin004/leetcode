class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {

            int distanceA = points[a][0] * points[a][0]
                    + points[a][1] * points[a][1];

            int distanceB = points[b][0] * points[b][0]
                    + points[b][1] * points[b][1];

            return distanceB - distanceA;
        });

        for (int i = 0; i < points.length; i++) {

            pq.add(i);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            int index = pq.poll();
            result[i] = points[index];
        }

        return result;
    }
}