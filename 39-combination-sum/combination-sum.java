import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        backtrack(candidates, target, cur, ans, 0, 0);

        return ans;
    }

    public void backtrack(int[] candidates, int target,
                          List<Integer> cur,
                          List<List<Integer>> ans,
                          int index, int sum) {

        // Base case: target achieved
        if (sum == target) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        // Stop if sum exceeds target
        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Choose a candidate
            cur.add(candidates[i]);

            // Recursive call: same index allows reuse
            backtrack(candidates, target, cur, ans,
                      i, sum + candidates[i]);

            // Backtrack: undo the choice
            cur.remove(cur.size() - 1);
        }
    }
}