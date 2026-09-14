class Solution {

    // 1. Choice take or noTake
    // 2. min no of choins
    int[][] mt;

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        mt = new int[n + 1][amount + 1];
        for (int i = 0; i < n + 1; i++) {
            mt[i][0] = 0;
        }

        for (int j = 1; j <= amount; j++) {
            mt[0][j] = amount + 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    mt[i][j] = Math.min((1 + mt[i][j - coins[i - 1]]), mt[i - 1][j]);
                } else {
                    mt[i][j] = mt[i - 1][j];
                }
            }
        }
        return mt[n][amount] == (amount+1) ? -1 : mt[n][amount];
    }

}