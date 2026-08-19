class Solution {
    public void setZeroes(int[][] matrix) {
        int row =matrix.length;
        int col =matrix[0].length;


        boolean[] x = new boolean[row];
        boolean[] y = new boolean[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (matrix[i][j] == 0) {
                    x[i] = true;
                    y[j] = true;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(x[i] || y[j]){
                    matrix[i][j] =0;
                }
            }
        }
    }
}