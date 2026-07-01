class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {

            int curr = arr[i];

            while (curr > 0 && curr <= n && arr[curr] != -1) {

                int next = arr[curr];
                arr[curr] = -1;
                curr = next;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i] != -1) {
                return i;
            }
        }

        return n + 1;
    }
}