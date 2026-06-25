// class Solution {
//     public int maxProfit(int[] prices) {
        
//     }
// }
public class Solution {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyprice) {//sp>bp
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);//compare honge profit or jo bda uske value sace
            } 
            else   {
                buyprice = prices[i];
                //as buy price is>sp  so we can buy and keep it for future
                
            }
        }

        return maxprofit;
    }
    
}


