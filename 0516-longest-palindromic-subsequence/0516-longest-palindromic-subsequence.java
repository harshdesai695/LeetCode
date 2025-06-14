class Solution {
    public int longestPalindromeSubseq(String s) {
        String x=s;
        String y = new StringBuilder(s).reverse().toString(); 
        int n = x.length();
		int m = y.length();
		int[][] mt = new int[n + 1][m + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				if (i == 0 || j == 0) {
					mt[i][j] = 0;
				}
			}
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (x.charAt(i - 1) == y.charAt(j - 1)) {
					mt[i][j] = 1 + mt[i - 1][j - 1];
				}else {
					mt[i][j]=Math.max(mt[i-1][j],mt[i][j-1]);
				}
			}
		}
        return mt[n][m];  
    }
}