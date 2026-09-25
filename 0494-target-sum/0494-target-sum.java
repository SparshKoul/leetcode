class Solution {
    public int ways(int nums[], int target, int i){
        if(i==nums.length){
            if(target == 0){
                return 1;
            }
            return 0;
        }
        int addtake= ways(nums,target-nums[i], i+1);
        int subskip = ways(nums,target+nums[i], i+1);

        return addtake+subskip;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums,target,0);
        
    }
}