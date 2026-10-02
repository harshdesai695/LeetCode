class Solution {
    int[][] t;

    public int minInsertions(String s) {
        String r = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int m = n;
        t = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                t[i][j] = -1;
            }
        }
        int len = LCS(s, r, n, m);

        return n - len;
    }

    public int LCS(String s, String r, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (t[n][m] != -1) {
            return t[n][m];
        }

        if (s.charAt(n - 1) == r.charAt(m - 1)) {
            return t[n][m] = 1 + LCS(s, r, n - 1, m - 1);
        } else {
            return t[n][m] = Math.max(LCS(s, r, n - 1, m), LCS(s, r, n, m - 1));
        }

    }
}