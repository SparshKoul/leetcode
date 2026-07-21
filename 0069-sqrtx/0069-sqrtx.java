class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        // ini guessr=x
        long r = x;
        
        while (r * r > x) {
            // Newton formula: r = (r + x / r) / 2
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}