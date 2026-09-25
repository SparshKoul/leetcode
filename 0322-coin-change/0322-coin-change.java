class Solution {
    //unbounded knapsack
    public long solve(int[] coins, int amount, int i ,long [][] dp ) {
        if (i == coins.length) {
            if (amount == 0) {
                return 0;//NO MORE COINS NEEDED
            } else {
                return Integer.MAX_VALUE; //NOT VALID COMB
            }
        }

        if(dp[i][amount] != -1){
            return dp[i][amount];
        }
        long skip = solve(coins, amount, i + 1,dp);
        if (coins[i] > amount) {
            return dp[i][amount]=skip;
        }

        long take = 1 + solve(coins, amount - coins[i], i,dp);

        return dp[i][amount]=Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {
        int n =coins.length;
        long [][] dp = new long [n][amount+1];
         // Initialize DP with -1
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        int ans =(int)solve(coins, amount, 0,dp);
        if(ans ==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}