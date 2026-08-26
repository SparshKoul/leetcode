class Solution {

    // index of max el in row 
    public int maxElement(int[][] arr, int row) {
        int m = arr[0].length;
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int j = 0; j < m; j++) {
            if (arr[row][j] > max) {
                max = arr[row][j];
                index = j;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] arr) {
        int n= arr.length;
        int m=arr[0].length;
        
        int low =0;
        int high =n-1;


        while(low<=high){
            int mid =low+(high-low)/2;

            //max el in mid row
            int col =maxElement(arr, mid);
            int up = mid - 1 >= 0 ? arr[mid - 1][col] : Integer.MIN_VALUE;

            int down = mid + 1 < n ? arr[mid + 1][col] : Integer.MIN_VALUE;


            if (arr[mid][col] > up &&
                arr[mid][col] > down) {

                return new int[]{mid, col};
            }
            //move up
             else if (up > arr[mid][col]) {

                high = mid - 1;
            }

            // down
            else {

                low = mid + 1;
            }

        }
        return new int [] {-1,-1};

    }
}