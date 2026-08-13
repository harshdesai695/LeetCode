class Solution {
    public int change(int amount, int[] coins) {
        int N = coins.length;
        int[][] t = new int[N + 1][amount + 1];

        for (int i = 0; i < N + 1; i++) {
            t[i][0] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    t[i][j] = t[i][j - coins[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[N][amount];
    }
}