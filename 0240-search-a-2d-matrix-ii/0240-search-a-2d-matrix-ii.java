class Solution {
    public boolean bs(int [] nums, int target){
        int low=0;
        int high =nums.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] >target){
                high =mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int col=matrix[0].length;
        int row=matrix.length;
        for(int i=0;i<row;i++){
            if(bs(matrix[i],target)){
                return true;
            }
        }
        return false;
        
    }
}