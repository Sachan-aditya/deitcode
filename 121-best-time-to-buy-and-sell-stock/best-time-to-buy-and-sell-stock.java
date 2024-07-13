class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through prices to find the minimum price and calculate the maximum profit
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; // Update the minimum price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min); // Calculate the profit and update maxProfit
            }
        }

        return maxProfit;
    }
}
