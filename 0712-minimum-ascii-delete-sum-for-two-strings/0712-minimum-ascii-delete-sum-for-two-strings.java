class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] mt = new int[n + 1][m + 1];
        // String str = "";

        for (int i = 1; i <= n; i++) {
            mt[i][0] = mt[i - 1][0] + s1.charAt(i - 1);
        }
        // printMatrix(mt);
        for (int j = 1; j <= m; j++) {
            mt[0][j] = mt[0][j - 1] + s2.charAt(j - 1);
        }
        // printMatrix(mt);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    mt[i][j] = mt[i - 1][j - 1];
                } else {
                    mt[i][j] = Math.min(mt[i - 1][j] + s1.charAt(i - 1), mt[i][j - 1] + s2.charAt(j - 1));
                }
            }
            // printMatrix(mt);
        }
        return mt[n][m];
    }

    private void printMatrix(int[][] matrix) {
        System.out.println("-----------------");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}