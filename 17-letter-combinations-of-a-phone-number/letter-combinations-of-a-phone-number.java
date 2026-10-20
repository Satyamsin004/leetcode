class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder cur = new StringBuilder();

        backtrack(digits, 0, map, cur, ans);

        return ans;
    }

    private void backtrack(String digits, int index,
                           String[] map, StringBuilder cur,
                           List<String> ans) {

        if (index == digits.length()) {
            ans.add(cur.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            cur.append(letters.charAt(i));

            backtrack(digits, index + 1, map, cur, ans);

            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
