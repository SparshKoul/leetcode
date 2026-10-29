class Solution {
    public int jump(int[] nums) {
        int L = 0;
        int R = 0;
        int jumps = 0;

        while (R < nums.length - 1) {
            int farthest = 0;

            for (int i = L; i <= R; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            L = R + 1;
            R = farthest;
            jumps++;
        }

        return jumps;
    }
}