class Solution {
    public boolean solve(int []nums,int target,int i, Boolean dp[][]){
        if(target == 0){
            return true;
        }
        if(i==nums.length) {
            return false;
        }
        if(dp[i][target] !=null){
            return dp[i] [target];
        }
        boolean skip = solve(nums, target,i+1,dp);
        boolean take = false;

        if (nums[i] <= target) {
            take = solve(nums, target - nums[i], i + 1,dp);
        }

        return dp[i][target] =skip || take;

    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        
        if(sum %2 !=0){
            return false;
        }
        int target =sum/2;
        Boolean dp [][] = new Boolean [nums.length][target+1];
        return solve(nums,target,0,dp);
        
    }
}