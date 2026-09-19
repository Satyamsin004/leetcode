class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < n) {
            int curr = asteroids[i];

            while (!st.isEmpty() && st.peek() > 0 && curr < 0) {
                if (Math.abs(st.peek()) > Math.abs(curr)) {
                    curr = 0;
                    break;
                } else if (Math.abs(st.peek()) < Math.abs(curr)) {
                    st.pop();
                } else {
                    st.pop();
                    curr = 0;
                    break;
                }

            }
            if (curr != 0) {
                st.push(curr);
                
            }
            i++;

        }
        int[] result = new int[st.size()];
        for (int j = 0; j < st.size(); j++) {
            result[j] = st.get(j);
        }
        return result;
    }
}