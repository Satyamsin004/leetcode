class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();
        Stack<Character> st = new Stack<>();
        Stack<Character> pt = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }

            } else {
                st.push(ch);
            }
        }
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (!pt.isEmpty()) {
                    pt.pop();
                }
            } else {
                pt.push(ch);
            }
        }
        if (st.equals(pt)) {
            return true;
        }

        return false;
    }
}