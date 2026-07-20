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

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public void printLevel(TreeNode root, int level, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            arr.add(root.val);
            return;
        }

        printLevel(root.left, level - 1, arr);
        printLevel(root.right, level - 1, arr);
    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        int h = height(root);

        for (int i = 1; i <= h; i++) {
            ArrayList<Integer> levelNodes = new ArrayList<>();

            printLevel(root, i, levelNodes);

            ans.add(levelNodes.get(levelNodes.size() - 1));
            //ans.add(levelNodes.get(0)); left side 

        }

        return ans;
    }
}
///For each level, store all the nodes at that level.
// we want the right-side view, take the last element of that level.
//Add it.