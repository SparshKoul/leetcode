class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n =arr.length;
        int left =0;
        double maxsum =0;

        if(n<k){
            return -1;
        }
        for(int i=0;i<k;i++){
            maxsum+=arr[i];
        }

        double windowsum=maxsum;
        for(int right =k;right<n;right++){
            windowsum+=arr[right];
            windowsum-=arr[right-k];

            maxsum =Math.max(windowsum,maxsum);
        }
        
        return maxsum/k;
        
    }
}