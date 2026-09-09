class Solution {

    public int climbStairs(int n) {
        int[] m = new int[n + 1];
        Arrays.fill(m, -1);
        return dp(n, m);
    }

    public int dp(int n, int[] m) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        if (m[n] != -1) {
            return m[n];
        }
        return m[n] = dp(n - 2, m) + dp(n - 1, m);
    }
}

// 5 
// 1 (5-1) = 4 
// 2 (5-2) = 3 