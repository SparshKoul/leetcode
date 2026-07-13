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

    public void paths(TreeNode root, String path, List<String> ans) {

        if (root == null) {
            return;
        }

        // leaf node
        if (root.left == null && root.right == null) {

            ans.add(path + root.val);

            return;
        }

        paths(root.left, path + root.val + "->", ans);

        paths(root.right, path + root.val + "->", ans);
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        paths(root, "", ans);

        return ans;
    }
}