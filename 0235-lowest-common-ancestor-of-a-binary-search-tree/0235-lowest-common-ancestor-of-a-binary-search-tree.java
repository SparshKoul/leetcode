/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        // this is actually for bt no bst
        if (root == null) {
            return null;
        }
        if (root.val == n1.val || root.val == n2.val) {
            return root;
        }
        TreeNode leftLCA = lowestCommonAncestor(root.left, n1, n2);
        TreeNode rightLCA = lowestCommonAncestor(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
        
    }
}