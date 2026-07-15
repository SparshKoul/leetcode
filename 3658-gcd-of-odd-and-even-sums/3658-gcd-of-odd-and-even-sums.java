class Solution {
    public int sumofeven(int n) {
        return n * (n + 1);
    }

    public int sumofodd(int n) {
        return n * n;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int gcdOfOddEvenSums(int n) {
        int a = sumofeven(n);
        int b = sumofodd(n);

        return gcd(a, b);
    }
}