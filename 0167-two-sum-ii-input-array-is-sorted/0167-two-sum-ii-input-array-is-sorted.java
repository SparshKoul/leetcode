class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int result=nums[left] +nums[right];
            if(result==target){
                return new int[]{left+1,right+1};
            }

            if(result<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int []{};
    }
}