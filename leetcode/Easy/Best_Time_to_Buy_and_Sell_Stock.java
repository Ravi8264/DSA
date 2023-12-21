public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(new Solution().maxProfit(prices));

    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int p = prices[i] - min;
            if (p > max) {
                max = p;
            }
        }
        return max;
    }
}