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
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    public void printlevel(TreeNode root, int level, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            arr.add(root.val);
            return;
        }
        printlevel(root.left, level - 1, arr);
        printlevel(root.right, level - 1, arr);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level = height(root);
        for (int i = 1; i <= level; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            printlevel(root,i,arr);
            ans.add(arr);

        }
        return ans;

    }
}