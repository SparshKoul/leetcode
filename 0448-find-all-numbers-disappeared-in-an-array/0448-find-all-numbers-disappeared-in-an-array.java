class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int x = 1; x <= nums.length; x++) {
            if (!set.contains(x)) {
                arr.add(x);
            }
        }

        return arr;
    }
}