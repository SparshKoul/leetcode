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
    public TreeNode findmin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }


    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else{
            // 0/1 child
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }

            //2 child
            TreeNode succ=findmin((root.right));//inorder succe is right trees smallet

            //repl val of what to del
            root.val=succ.val;

            //del old
            root.right=deleteNode(root.right,succ.val);
        }
        return root;
    }
}