class Solution {
    public int differenceOfSums(int n, int m) {
        int sumdiv = 0;
        int sumnotdiv = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumdiv += i;
            } else {
                sumnotdiv += i;
            }
        }

        return sumnotdiv-sumdiv;

    }
}