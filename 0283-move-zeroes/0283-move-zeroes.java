
class Solution {
    public void moveZeroes(int[] nums) {
        //0s is not pushed behind rather swapped witht those non 0s
       int j =0;
       for(int i=0;i<nums.length;i++){
        if(nums[i] !=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            j++;
        }
       }
       //return nums;

    }
}