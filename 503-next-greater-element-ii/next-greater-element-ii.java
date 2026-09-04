class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;

            while (!st.isEmpty() && nums[st.peek()] < nums[index]) {
                res[st.pop()] = nums[index];
            }

            if (i < n) {
                st.push(index);
            }
        }

        while (!st.isEmpty()) {
            res[st.pop()] = -1;
        }

        return res;
    }
}