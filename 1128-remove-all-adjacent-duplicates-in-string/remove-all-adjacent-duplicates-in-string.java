class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            } else if(st.peek() == ch) {
                st.pop();

            } else {
                st.push(ch);
            }

        }
        StringBuilder ans = new StringBuilder();
        int m = st.size();
        for(int i = 0;i<m;i++){
            ans.append(st.get(i));
        }
        return ans.toString();
    }
}