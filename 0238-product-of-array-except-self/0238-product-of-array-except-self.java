class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int zeroCount = 0;
        int product = 1;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        if (zeroCount > 1) {
            return ans;   
        }

        if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    ans[i] = product;
                } else {
                    ans[i] = 0;
                }
            }
            return ans;
        }

        //  No zeros
        for (int i = 0; i < n; i++) {
            ans[i] = product / nums[i];
        }

        return ans;
    }
}