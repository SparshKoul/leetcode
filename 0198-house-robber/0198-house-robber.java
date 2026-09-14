class Solution {
    public int amount (int nums[], int []dp ,int i){
        if (i >= nums.length) {
            return 0;
        }
        if(dp[i] !=-1){
            return dp[i];
        }
        int rob =nums[i]+ amount(nums,dp,i+2);
        int skip =amount(nums,dp,i+1);
        dp[i] =Math.max(rob,skip);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[] = new int [n];
        Arrays.fill(dp,-1);

        return amount(nums,dp,0);
        
    }
}