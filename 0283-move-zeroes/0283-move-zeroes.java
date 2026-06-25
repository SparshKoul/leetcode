class Solution {
    public void moveZeroes(int[] nums) {
        //0s is not pushed behinf rather swapped witht those non 0s
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
        
        
    }
}