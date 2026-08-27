class Solution {

    public int max(int[][] mat, int row) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        int m = mat[0].length;

        for (int i = 0; i < m; i++) {
            if (mat[row][i] > max) {
                max = mat[row][i];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int col = max(mat, mid);

            int up = mid - 1 >= 0 ? mat[mid - 1][col] : Integer.MIN_VALUE;
            int down = mid + 1 < n ? mat[mid + 1][col] : Integer.MIN_VALUE;

            if (mat[mid][col] > up && mat[mid][col] > down) {
                return new int[] { mid, col };
            } else if (up > mat[mid][col]) {

                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return new int[] { -1, -1 };

    }
}