class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }
        int pairs = 0;
        int leftover = 0;
        while (!pq.isEmpty()) {
            int x = pq.poll();
            if (!pq.isEmpty() && pq.peek() == x) {
                pairs++;
                pq.poll();
            } else {
                leftover++;
            }

        }

        return new int[] { pairs, leftover };

    }
}