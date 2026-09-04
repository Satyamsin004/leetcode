class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        int[] res = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = st.peek() - i;
            }
            st.push(i);
        }

        return res;
    }
}