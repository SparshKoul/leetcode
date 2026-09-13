class Solution {
    public int mincost(int [] cost , int i,int [] dp){
        if(i==0){
            return cost[0];
        }
        if(i==1){
            return cost[1];
        }
        if(dp[i] !=-1){
            return dp[i];
        }
        return dp[i]=cost[i] +Math.min(mincost(cost,i-1,dp),mincost(cost,i-2,dp));
        

    }
    // last stair is not 20 it is after 20 ie index =2 
    // thereofre we can reach that via n-1 or n-2 
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,n-1,dp),mincost(cost,n-2,dp));
        
    }
}