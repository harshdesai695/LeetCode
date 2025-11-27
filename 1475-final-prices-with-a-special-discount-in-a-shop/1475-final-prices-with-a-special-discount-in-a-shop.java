class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            // System.out.println("I->"+prices[i]);
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                // System.out.println("j->"+prices[j]);
                if (prices[j] <= prices[i]) {
                    // System.out.println("inside");
                    ans[i] = prices[i] - prices[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans[i] = prices[i];
            }
        }
        return ans;
    }
}