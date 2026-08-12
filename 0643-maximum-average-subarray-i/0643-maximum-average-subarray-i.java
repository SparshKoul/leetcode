class Solution {
    public double findMaxAverage(int[] arr, int k) {

        int n = arr.length;
        if (n < k) {
            return -1; // Not enoughwindow
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int windowSum = maxSum;

        for (int right = k; right < n; right++) {
            windowSum += arr[right];
            windowSum -= arr[right - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;

    }
}