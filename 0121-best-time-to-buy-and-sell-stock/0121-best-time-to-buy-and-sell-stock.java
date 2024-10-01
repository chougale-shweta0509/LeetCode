class Solution {
    public int maxProfit(int[] prices) {
        //at the beginning tne minimum price is the 1st price
        int buy_price = prices[0];
        
        //at the beginning the minimum profit is 0
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }else{
                int cur_profit = prices[i] - buy_price;
                 profit = Math.max(cur_profit, profit);
            }
        }
        return profit;
    }
}