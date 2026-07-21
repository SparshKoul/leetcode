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
    public  int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right) +1;
    }

    public void printlevel(TreeNode root,int level, List<Integer> arr){
        if(root==null){
            return;
        }
        if(level==1){
            arr.add(root.val);
            return;
        }
        printlevel(root.left,level-1,arr);
        printlevel(root.right,level-1,arr);
    }
    public List<Integer> largestValues(TreeNode root) {

        List <Integer> ans =new ArrayList<>();
        int h=height(root);

        for(int i=1;i<=h;i++){
            List<Integer> arr =new ArrayList<>();
            printlevel(root,i,arr);

            int max=arr.get(0);
            for(int num :arr){
                max=Math.max(max,num);
            }

            ans.add(max);

        }
        return ans;
        
    }
}