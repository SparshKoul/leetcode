class Solution {

    //instead of tring passing bew pass indesx of string;
    public int longestCommonSubsequence(String text1, String text2) {

        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);

        int m = text1.length();
        int n = text2.length();

        //dp i -> m-1 to 0
        // j  -> n-1 to 0

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int p = (i > 0 && j > 0) ? dp[i - 1][j - 1] : 0;

                int q = (j > 0) ? dp[i][j - 1] : 0;
                int r = (i > 0) ? dp[i - 1][j] : 0;
                if (a.charAt(i) == b.charAt(j)) {
                    dp[i][j] = 1 + p;
                } else {
                    dp[i][j] = Math.max(q, r);
                }
            }
        }

        return dp[m - 1][n - 1];

    }
}