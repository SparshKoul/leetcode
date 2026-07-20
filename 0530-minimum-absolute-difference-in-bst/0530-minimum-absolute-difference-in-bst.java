class Solution {

    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        // curr node
        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }
        prev = root.val;

        inorder(root.right);
    }
}