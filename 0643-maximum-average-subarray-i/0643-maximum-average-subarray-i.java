class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n =nums.length;
        double maxsum =0;
        for(int i=0;i<k;i++){
            maxsum +=nums[i];
        }

        double windowsum =maxsum;
        for(int right =k;right<n;right++){
            windowsum+=nums[right];
            windowsum-=nums[right-k];

            maxsum=Math.max(windowsum,maxsum);
        }
        return maxsum/k;
        
    }
}