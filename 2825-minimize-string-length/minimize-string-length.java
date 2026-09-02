class Solution {
    public int minimizedStringLength(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.contains(ch)) {
                st.push(ch);
            }
        }

        return st.size();
    }
}