class Solution {
    public int minimizedStringLength(String s) {
        int n = s.length();
        HashSet<Character> ans = new HashSet<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            ans.add(ch);
        }
        return ans.size();
    }
}