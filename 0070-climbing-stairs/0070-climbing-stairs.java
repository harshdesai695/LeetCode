class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return countSteps(dp, n);
    }

    public int countSteps(int[] dp, int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (dp[n] == -1) {
            dp[n] = countSteps(dp, n - 1) + countSteps(dp, n - 2);
        }
        return dp[n];
    }
}