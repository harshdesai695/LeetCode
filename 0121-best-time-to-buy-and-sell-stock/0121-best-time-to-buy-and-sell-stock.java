class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mini=prices[0];
        int arrlength=prices.length;
        for(int i=1;i<arrlength;i++){
            int cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(prices[i],mini);
        }
        return profit;
    }
}