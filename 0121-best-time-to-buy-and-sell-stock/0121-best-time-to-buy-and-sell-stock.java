class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int bestBuy = prices[0];
        for(int i=1;i<prices.length;i++){
            int currentprice=prices[i];
            if(currentprice>bestBuy){
             profit=Math.max(profit,currentprice-bestBuy);
            }
            bestBuy=Math.min(bestBuy,currentprice);
        }
        return profit;
    }
}