class Solution {
    int[][] mt;

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        mt = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                mt[i][j] = -1;
            }
        }
        return LCS(text1, text2, n, m);
    }

    public int LCS(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (mt[n][m] != -1) {
            return mt[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return mt[n][m] = 1 + LCS(s1, s2, n - 1, m - 1);
        } else {
            return mt[n][m] = Math.max(LCS(s1, s2, n - 1, m), LCS(s1, s2, n, m - 1));
        }
    }
}