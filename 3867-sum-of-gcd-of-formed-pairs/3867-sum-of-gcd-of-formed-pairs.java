class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;

        //prefix maximum array
        int[] mx = new int[n];
        mx[0] = nums[0];

        for (int i = 1; i < n; i++) {
            mx[i] = Math.max(mx[i - 1], nums[i]);
        }
        int[] prefixGCD = new int[n];

        for (int i = 0; i < n; i++) {
            prefixGCD[i] = gcd(nums[i], mx[i]);
        }
        Arrays.sort(prefixGCD);

        //pairs

        long sum = 0;
        int small = 0;
        int large = n - 1;

        while (small < large) {
            sum += gcd(prefixGCD[small], prefixGCD[large]);
            small++;
            large--;

        }
        return sum;

    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;

        }
        return gcd(b, a % b);
    }
}