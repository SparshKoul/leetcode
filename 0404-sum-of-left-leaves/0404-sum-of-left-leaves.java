/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.left != null &&//left childdd present?
            root.left.left == null &&//left child should be treeee
            root.left.right == null) {

            sum += root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}