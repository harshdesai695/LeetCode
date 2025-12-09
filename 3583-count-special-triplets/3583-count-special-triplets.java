class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int maxVal = 0;
        for (int x : nums) {
            maxVal = Math.max(maxVal, x);
        }
        maxVal *= 2;
        int[] freqPrev = new int[maxVal + 1];
        int[] freqNext = new int[maxVal + 1];
        for (int x : nums) {
            freqNext[x]++;
        }

        long ans = 0;

        for (int x : nums) {
            freqNext[x]--;
            int t = x * 2;
            if (t <= maxVal) {
                ans = (ans + (long) freqPrev[t] * freqNext[t]) % MOD;
            }
            freqPrev[x]++;
        }

        return (int) ans;
    }
}