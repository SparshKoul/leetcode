class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue() % k == 0) {
                sum += entry.getKey() * entry.getValue();
            }
        }
        return sum;
    }
}