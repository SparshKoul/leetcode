class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2)
            return nums.length;

        int index = 2;

        for (int i = 2; i < nums.length; i++) {

            if (nums[i] != nums[index - 2]) {//1 with 3rd

                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}