class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
                int profit = prices[i] -minPrice;
                if(profit>maxprofit) {
                    maxprofit=profit;
                }
            }
        
        return maxprofit;
    }
}