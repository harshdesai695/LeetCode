class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        int[][] mt = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            mt[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    mt[i][j] = mt[i - 1][j] + mt[i][j - coins[i - 1]];
                } else {
                    mt[i][j] = mt[i - 1][j];
                }
            }
        }
        return mt[n][amount];

    }
}