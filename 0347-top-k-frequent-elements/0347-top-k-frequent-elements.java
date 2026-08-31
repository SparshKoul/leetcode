class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] ans = new int[k];
        int x = 0;

        while (x < k) {
            int maxFreq = Integer.MIN_VALUE;
            int maxNum = 0;
            for (int num : map.keySet()) {
                int freq = map.get(num);
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxNum = num;
                }

            }
            ans[x] = maxNum;
            x++;
            map.remove(maxNum);

        }
        return ans;

    }
}