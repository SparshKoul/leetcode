class Solution {
    public int path(int[][] grid, int i, int j, int[][] dp) {

        //base eventuallyy we reach 0,0
        if (i == 0 && j == 0) {
            return grid[0][0];
        }
        //if we at top we dont to at row<0
        if (i == 0) {
            return grid[i][j] + path(grid, i, j - 1, dp);
        }
        if (j == 0) {
            return grid[i][j] + path(grid, i - 1, j, dp);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        dp[i][j] = grid[i][j] + Math.min(
                path(grid, i - 1, j, dp),
                path(grid, i, j - 1, dp));

        return dp[i][j];

    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return path(grid, m - 1, n - 1, dp);

    }
}