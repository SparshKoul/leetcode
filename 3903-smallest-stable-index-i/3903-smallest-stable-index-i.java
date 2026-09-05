class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int prefixmax[] =new int [nums.length];
        prefixmax[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],nums[i]);
        }

        int suffixmin[] =new int[nums.length];
        suffixmin[n - 1] = nums[n - 1];

        for(int i=n-2;i>=0;i--){
            suffixmin[i] =Math.min(suffixmin[i+1],nums[i]);
        }
        int score=0;
        for(int i=0;i<n;i++){
            score=prefixmax[i] - suffixmin[i] ;
            if(score<=k){
                return i;
            }
        }
        return -1;
        
    }
}