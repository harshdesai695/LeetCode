class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] mt = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            mt[i][0] = 0; 
        }
        for (int j = 1; j <= amount; j++) {
            mt[0][j] = Integer.MAX_VALUE - 1; 
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    mt[i][j] = Math.min(mt[i - 1][j], 1 + mt[i][j - coins[i - 1]]);
                } else {
                    mt[i][j] = mt[i - 1][j];
                }
            }
        }

        return mt[n][amount] == Integer.MAX_VALUE - 1 ? -1 : mt[n][amount];
    }
}
