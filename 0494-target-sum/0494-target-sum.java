class Solution {

    static int sum;

    public int ways(int nums[], int target, int i, int[][] dp) {

        if(target > sum || target < -sum){
            return 0;
        }

        if(i == nums.length){
            if(target == 0){
                return 1;
            }
            return 0;
        }

        if(dp[i][target + sum] != Integer.MIN_VALUE){
            return dp[i][target + sum];
        }

        int addtake = ways(nums, target - nums[i], i + 1, dp);

        int subskip = ways(nums, target + nums[i], i + 1, dp);

        return dp[i][target + sum] = addtake + subskip;
    }

    public int findTargetSumWays(int[] nums, int target) {

        sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        if(target > sum || target < -sum){
            return 0;
        }

        int[][] dp = new int[nums.length][2 * sum + 1];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < 2 * sum + 1; j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        return ways(nums, target, 0, dp);
    }
}