class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currsum=nums[0];
        int n=nums.length;

        for(int i=1; i<n; i++){
            currsum=Math.max(nums[i],nums[i]+currsum);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}