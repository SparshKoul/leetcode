class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {

                    //col
                    //mark it as -10 not -1 as it can be an elem in mat
                    for (int x = 0; x < col; x++) {
                        if (matrix[i][x] != 0) {
                            matrix[i][x] = -10;
                        }
                    }

                    //row
                    for (int y = 0; y < row; y++) {
                        if (matrix[y][j] != 0) {
                            matrix[y][j] = -10;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -10) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}