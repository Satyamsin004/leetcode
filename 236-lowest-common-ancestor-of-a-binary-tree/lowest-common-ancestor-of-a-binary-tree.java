
class Solution {

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans = null;

        findLCA(root, p, q);

        return ans;
    }

    private int findLCA(TreeNode node, TreeNode p, TreeNode q) {

        // Base case
        if (node == null) {
            return 0;
        }

        // Recursively explore left and right
        int left = findLCA(node.left, p, q);
        int right = findLCA(node.right, p, q);

        // Check whether current node is p or q
        int self = 0;

        if (node == p || node == q) {
            self = 1;
        }

        // Calculate total number of target nodes found
        int total = left + right + self;

        // First node where both targets are found is the LCA
        if (total == 2 && ans == null) {
            ans = node;
        }

        return total;
    }
}
