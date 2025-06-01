class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] mt = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(mt[i], -1);
        }

        int lcsLength = LCS(text1,text2,  n, m, mt);
        return lcsLength;
    }

    public static int LCS(String x,String y,int n,int m,int[][] mt) {
		if(m==0 || n==0) {
			return 0;
		}
        if (mt[n][m] != -1) {
            return mt[n][m];
        }
		if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return mt[n][m] = 1 + LCS(x, y, n - 1, m - 1, mt);
        } else {
            return mt[n][m] = Math.max(LCS(x, y, n - 1, m, mt), LCS(x, y, n, m - 1, mt));
        }
	}
}