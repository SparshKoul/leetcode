class Solution {
    public boolean sqrt (int x){
        int val =(int)Math.sqrt(x);
        return val*val==x;
    }

    public int solve(int n, int []dp){
        if(sqrt(n)) return 1;
        if(dp[n]!=-1){
            return dp[n];

        }
        int min =Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            //int count =solve(i*i,dp) + solve(n-i*i,dp);// as i*i is sure a perfect sq ie one value  always 
            int count = 1+solve(n-i*i,dp);
            min =Math.min(min,count);
        }
        dp[n] =min;
        return dp[n] ;

    }
    public int numSquares(int n) {
        int dp[] =new int [n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
        
    }
}