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
    public void collectleaves(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null) {
            arr.add(root.val);
            return;
        }
        collectleaves(root.left, arr);
        collectleaves(root.right, arr);

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        collectleaves(root1, list1);
        collectleaves(root2, list2);

        return list1.equals(list2);

    }
}