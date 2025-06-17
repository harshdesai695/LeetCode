class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int[] mt = new int[n + 1];
        mt[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                mt[i] = 0;
            } else {
                mt[i] = mt[i] + mt[i + 1];

                if (i + 1 < n && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
                    mt[i] = mt[i] + mt[i + 2];
                }

            }
        }
        return mt[0];
    }
}