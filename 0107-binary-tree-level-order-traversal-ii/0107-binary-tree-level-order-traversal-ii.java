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
 import java.util.*;
class Solution {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right =height(root.right);

        return Math.max(left,right) +1;
    }
    public void printlevel(TreeNode root ,ArrayList <Integer> arr, int level){
        if(root==null)return ;
        if(level==1){
            arr.add(root.val);
            return;
        }

        printlevel(root.left,arr,level-1);
        printlevel(root.right,arr,level-1);

    }
    public void rev(List<List <Integer>> arr){
        int size=arr.size();
        int left=0;
        int right =size-1;
        while(left<right){
            List<Integer> temp=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            
            
            left++;
            right--;
        }

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        int  level=height(root);
        for(int i=1;i<=level;i++){
            ArrayList<Integer> arr =new ArrayList<>();
            printlevel(root,arr,i);
            ans.add(arr);

        }
        rev(ans);

        return ans;
    }
}