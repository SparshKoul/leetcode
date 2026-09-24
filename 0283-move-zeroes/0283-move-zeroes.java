class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                for(int j=i;j>pos;j--){
                    arr[i] =arr[i-1];
                }
                arr[pos] =temp;
                pos++;
            }
            
        }
    
        
    }
}