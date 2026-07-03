class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int index=n-1;
        int result [] =new int[n];
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[index]=arr[left]*arr[left];
                left++;
            }
            else{
                result[index]=arr[right]*arr[right];
                right--;
            }
            index--;

        }
        return result;
        
    }
}