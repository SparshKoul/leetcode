import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[nums.length];
        int k = 0;

        while (!map.isEmpty()) {

            int minFreq = Integer.MAX_VALUE;
            int maxNum = Integer.MIN_VALUE;

            for (int num : map.keySet()) {
                int freq = map.get(num);

                if (freq < minFreq) {
                    minFreq = freq;
                    maxNum = num;
                } else if (freq == minFreq && num > maxNum) {
                    maxNum = num;
                }
            }

            for (int i = 0; i < minFreq; i++) {
                ans[k++] = maxNum;
            }

            map.remove(maxNum);
        }

        return ans;
    }
}