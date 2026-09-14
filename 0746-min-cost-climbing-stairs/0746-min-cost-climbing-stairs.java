class Solution {
    public int min(int[] cost, int[] dp, int i) {
        if (i == 0)
            return cost[0];
        if (i == 1)
            return cost[1];

        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = cost[i] + Math.min(
            min(cost,dp ,i-1),
            min(cost,dp ,i-2));
        return dp[i];

    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        //top could be reched by eith last index or seconf last index ie n-1/n-2
        return Math.min(min(cost, dp, n - 1), min(cost, dp, n - 2));

    }
}