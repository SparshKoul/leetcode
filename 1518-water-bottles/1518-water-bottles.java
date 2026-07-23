class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            int newbottle = numBottles / numExchange;

            total += newbottle;
            int rem = numBottles % numExchange;

            numBottles = newbottle + rem;
        }
        return total;
    }
}