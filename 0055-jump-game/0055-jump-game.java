class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) 
            goal = i;  // i can reach current goal
        }

        return goal == 0;
    }
}   