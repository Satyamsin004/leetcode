class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, "", 0, 0, n);
        return ans;
    }

    private void solve(List<String> ans, String cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            ans.add(cur);
            return;
        }

        if (open < n) {
            solve(ans, cur + "(", open + 1, close, n);
        }

        if (close < open) {
            solve(ans, cur + ")", open, close + 1, n);
        }
    }
}