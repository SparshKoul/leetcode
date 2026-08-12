class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {

        int n = nums.length;
        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            if (right - left + 1 == k) {

                if (sum >= threshold * k) { // sum/k =avg   ==thh    sum =th*k
                    count++;
                }

                sum -= nums[left];
                left++;
            }
        }

        return count;
    }
}