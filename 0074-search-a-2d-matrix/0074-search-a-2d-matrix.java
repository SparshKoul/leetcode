class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int total = rows * columns;

        int low = 0;
        int high = total - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / columns;
            int column = mid % columns;

            if (target == matrix[row][column]) {
                return true;
            } else if (target > matrix[row][column]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}