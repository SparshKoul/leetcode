class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int small = nums[0];
        int large = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                large = nums[i];
            }
            if (nums[i] < small) {
                small = nums[i];
            }
        }

        for (int i = small; i <= large; i++) {

            boolean found = false;

            for (int num : nums) {
                if (num == i) {
                    found = true;
                }
            }

            if (!found) {
                arr.add(i);
            }
        }
        return arr;

    }
}