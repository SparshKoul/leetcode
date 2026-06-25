class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        //greates
        for (int num : nums) {
            if (num > firstMax) {
                firstMax = num;
            }
        }
        //second greatest
        for (int num : nums) {
            if (num < firstMax && num > secondMax) {
                secondMax = num;
            }
        }
        //third greatest
        for (int num : nums) {
            if (num < secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax != Long.MIN_VALUE) {
            return (int) thirdMax;
        }
        
        return (int) firstMax;
    }
}