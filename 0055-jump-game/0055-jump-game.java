class Solution {
    public boolean canJump(int[] nums) {
        int n =nums.length;
        int maxindx=0; // max indx we can reach

        for(int i=0;i<n;i++){

            if(i> maxindx){//loop keep on work but we are stuck
                return false;
            }

            maxindx=Math.max(maxindx,i+nums[i]);
        }
        return true;

        
    }
}