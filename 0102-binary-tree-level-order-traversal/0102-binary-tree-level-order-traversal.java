/*
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
    //height according to no of levels.
    public  int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    //print specific level 
    public static void printLevel(TreeNode root, int level, ArrayList <Integer> arr) {
        if (root == null) {
            return;
        }
        if (level == 1) {
           arr.add(root.val);
            return;
        }
        printLevel(root.left, level - 1,arr);
        printLevel(root.right, level - 1,arr);

    }
    


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        int levels = height(root);

        for(int  i =1;i<=levels;i++){
            ArrayList <Integer> arr =new ArrayList<>();
            printLevel(root, i, arr);

            ans.add(arr);
        }

        return ans;
    }
}