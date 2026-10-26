class Solution {
    public String reverse(String str){
        StringBuilder sb = new StringBuilder (str);
        return sb.reverse().toString();
    }
    public int lcs (int i , int j ,StringBuilder a , StringBuilder b, int dp[][]){
        
        
        if(i<0 || j <0){
            return 0;
        }

        
        if(dp[i][j] !=-1){
            return dp[i][j];
        }


        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j]= 1 + lcs(i - 1, j - 1, a, b,dp);
        } else {
            return dp[i][j]=Math.max(
                    lcs(i - 1, j, a, b,dp),
                    lcs(i, j - 1, a, b,dp));
        }



    }

    public int longestPalindromeSubseq(String ss) {
        String x =reverse(ss);
        StringBuilder rev= new StringBuilder (x);
        StringBuilder s = new StringBuilder (ss);


        int m =s.length();
        int n = rev.length();
        int dp [][] = new int [m][n];
        for(int i=0;i<m;i++){
            for (int j =0;j<n;j++){
                dp[i][j]  =-1;
            }
        }


        return lcs(m - 1, n - 1, s, rev,dp);


        
        
    }
}