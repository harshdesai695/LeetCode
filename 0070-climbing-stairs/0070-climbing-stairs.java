class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return countWays(n, dp);
    }

    public int countWays(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp);
        }

        return dp[n];
    }
}