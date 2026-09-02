class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < st.size(); i++) {
            char m = st.get(i);
            ans.append(m);
        }
        return ans.toString();
    }
}