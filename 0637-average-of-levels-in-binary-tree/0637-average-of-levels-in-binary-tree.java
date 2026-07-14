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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        int h = height(root);

        for (int i = 1; i <= h; i++) {

            long sum = sumLevel(root, i);
            int count = countLevel(root, i);

            ans.add((double) sum / count);
        }

        return ans;
    }


    //sum for each level
    public long sumLevel(TreeNode root, int level) {
        if (root == null) return 0;

        if (level == 1) {
            return root.val;
        }

        return sumLevel(root.left, level - 1)+ sumLevel(root.right, level - 1);
    }
    //no of nodes at each level
    public int countLevel(TreeNode root, int level) {
        if (root == null) return 0;

        if (level == 1) {
            return 1;
        }

        return countLevel(root.left, level - 1)+ countLevel(root.right, level - 1);
    }

    //no of leavel k hisb hwihggt
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}