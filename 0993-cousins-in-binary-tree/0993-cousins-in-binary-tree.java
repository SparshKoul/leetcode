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

    public int level(TreeNode root, int target, int lev) {
        if (root == null) {
            return 0;
        }

        if (root.val == target) {
            return lev;
        }

        int left = level(root.left, target, lev + 1);

        // If in the left subtree, no search right.
        if (left != 0) {
            return left;
        }

        return level(root.right, target, lev + 1);
    }

    public boolean isSibling(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) ||
                    (root.left.val == y && root.right.val == x)) {
                return true;
            }
        }

        return isSibling(root.left, x, y)
                || isSibling(root.right, x, y);
    }

    public boolean isCousins(TreeNode root, int x, int y) {

        int levelX = level(root, x, 1);
        int levelY = level(root, y, 1);

        if (levelX != levelY) {
            return false;
        }

        if (isSibling(root, x, y)) {
            return false;
        }

        return true;
    }
}