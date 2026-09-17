class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            if(prices[i] > buyPrice){
                int profit = prices[i] - buyPrice;
                result = Math.max(profit, result);
            }
        }
        return result;
    }
}
