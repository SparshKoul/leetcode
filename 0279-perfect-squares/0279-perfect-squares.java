class Solution {
    public boolean sqrt (int x){
        int val =(int)Math.sqrt(x);
        return val*val==x;
    }

    
    public int numSquares(int n) {
        int dp[] =new int [n+1];
        for(int i=1;i<=n;i++){
            if(sqrt(i)) dp[i] =1;
            else{
                int min =Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    int count = dp[j*j]+ dp[i-j*j];
                    min =Math.min(min,count);

                }
                dp[i] =min;
            }
        }
        return dp[n];
        
    }
}