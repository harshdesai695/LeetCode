class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long product = 1;
        long mod = 12345;
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = (int) (product % mod);
                product = (product * grid[i][j]) % mod;
            }
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                result[i][j] = (int) ((product * result[i][j]) % mod);
                product = (product * grid[i][j]) % mod;
            }
        }

        return result;
    }
}