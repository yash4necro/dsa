class BestTimeToBuySellStock121 {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0], sellPrice, maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}