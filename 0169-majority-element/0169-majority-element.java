import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int limit = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            
        }

        for(int num:map.keySet()){
            if (map.get(num) > limit) {
                return num;
            }
        }
        return -1;
    }
}
