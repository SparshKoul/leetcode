class Solution {

    //tabulation but base case is handled via diff size of dp

    //instead of tring passing bew pass indesx of string;
    public int longestCommonSubsequence(String text1, String text2) {

        
        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {

            //if same then add that char and move dif up 
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                ans.append(text1.charAt(i - 1));
                i--;
                j--;
            }//if diff then select the char either left/right
            //left bigger than up then move left
             else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.println(ans.reverse().toString());

        return dp[m][n];

    }
}