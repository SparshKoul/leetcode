class Solution {
    public int LENGTHlongestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];

    }

    public String Printlcs(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                ans.append(text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return ans.reverse().toString();

    }

    public String shortestCommonSupersequence(String a, String b) {

        int m = a.length();
        int n = b.length();
        int lcs = LENGTHlongestCommonSubsequence(a, b);

        int SCSLENGTH = lcs + (m - lcs) + (n - lcs);
        System.out.println(SCSLENGTH);

        String lcsstr = Printlcs(a, b);
        StringBuilder scs = new StringBuilder();

        int i = 0;// str1
        int j = 0;//str2
        int k = 0; //lcsstr

        while (i < a.length() && j < b.length() && k < lcsstr.length()) {
            while (a.charAt(i) != lcsstr.charAt(k)) {
                scs.append(a.charAt(i));
                i++;
            }
            while (b.charAt(j) != lcsstr.charAt(k)) {
                scs.append(b.charAt(j));
                j++;
            }
            scs.append(lcsstr.charAt(k));
            i++;
            j++;
            k++;
        }

        //what if a str got finished yet there are some elemts of otehrb str left so the point of the other str left to that str end directly add em

        // When k == lcsstr.length() but neither string has finished, both conditions are false.

        // if(i==a.length()){
        //     scs.append(b.substring(j,b.length()));
        // }
        // else if(j==b.length()){
        //     scs.append(a.substring(i,a.length()));
        // }
        
        scs.append(a.substring(i));
        scs.append(b.substring(j));

        return scs.toString();

    }
}