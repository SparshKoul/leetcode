class Solution {
    public int firstMissingPositive(int[] nums) {
        //sort array start frinding from 1 then2 3 4 ...

        Arrays.sort(nums);
        int n=nums.length;
        int helper=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==helper){
                helper++;
            }
        }
        return helper;
        
    }
}