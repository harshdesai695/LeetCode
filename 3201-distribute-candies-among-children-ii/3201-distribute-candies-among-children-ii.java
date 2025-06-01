class Solution {
    public long distributeCandies(int n, int limit) {
        long total = 0;

        for (int k = 0; k <= 3; k++) {
            long remaining = n - k * (limit + 1);
            if (remaining < 0)
                continue;

            int sign = (k % 2 == 0) ? 1 : -1;
            total += sign * binomial(3, k) * binomial(remaining + 2, 2);
        }

        return total;
    }

    public static long binomial(long n, long k) {
        if (k < 0 || k > n)
            return 0;
        if (k == 0 || k == n)
            return 1;
        if (k > n - k)
            k = n - k;

        long result = 1;
        for (long i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}