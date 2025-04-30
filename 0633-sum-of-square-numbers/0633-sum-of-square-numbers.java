class Solution {
    public boolean judgeSquareSum(int c) {
        for (int a = 0; a * a <= c / 2; a++) {
            int aSquared = a * a;
            int bSquared = c - aSquared;
            int b = (int) Math.sqrt(bSquared);
            if (b * b == bSquared) {
                return true;
            }
        }
        return false;
    }
}