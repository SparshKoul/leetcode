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

    public void printlevel(TreeNode root, int level, ArrayList<Integer> arr) {
        if (root == null)
            return;
        if (level == 1) {
            arr.add(root.val);
            return;
        }

        printlevel(root.left, level - 1, arr);
        printlevel(root.right, level - 1, arr);
    }

    public void printlevelreverse(TreeNode root, int level, ArrayList<Integer> arr) {
        if (root == null)
            return;
        if (level == 1) {
            arr.add(root.val);
            return;
        }

        printlevelreverse(root.right, level - 1, arr);
        printlevelreverse(root.left, level - 1, arr);
    }

    //height : no of levels.
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= level; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            if (i % 2 == 1) {
                printlevel(root, i, arr);

            } else {
                printlevelreverse(root, i, arr);
            }
            ans.add(arr);
        }
        return ans;
    }

}