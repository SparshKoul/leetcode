class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n=arr.length;
        int evenpos=0;
        for(int i=0;i<n;i++){
            if(arr[i] %2 ==0){
                int temp =arr[i];

                for(int j=i;j>evenpos;j--){
                    arr[j] =arr[j-1];
                }
                arr[evenpos] =temp;
                evenpos++;
            }
        }
        return arr;
        
    }
}