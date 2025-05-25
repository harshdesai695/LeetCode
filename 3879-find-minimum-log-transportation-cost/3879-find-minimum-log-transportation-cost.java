class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long ans = 0;

        if (n == 0 || m == 0 || k == 0) {
            return 0;
        }

        if (m <= k && n <= k) {
            return ans;
        }

        if (m > k && n <= k) {
            ans = ans + (long) (m - k) * k;
        }
        if (n > k && m <= k) {
            ans = ans + (long) (n - k) * k;
        }
        return ans;
    }
}