class Solution {
    public int lcs(int i, int j, StringBuilder text1, StringBuilder text2, int [][] dp) {

        if (i < 0 || j < 0) { /// < as not = as index can be 0
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }


        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + lcs(i - 1, j - 1, text1, text2,dp);
        } else {
            return dp[i][j] = Math.max(
                    lcs(i - 1, j, text1, text2,dp),
                    lcs(i, j - 1, text1, text2,dp));
        }

    }

    public int longestCommonSubsequence(String text1, String text2) {

        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);

        int m = text1.length();
        int n = text2.length();


        //i = m-1 -> 0
        //j = n-1 -> 0
        int dp [][] = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }



        return lcs(m - 1, n - 1, a, b ,dp);

    }
}