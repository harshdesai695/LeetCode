class Solution {
    int div;
    Integer[][][] mt;

    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        div = k;
        mt = new Integer[n + 1][m + 1][k];
        return dfs(grid, 0, 0, 0);
    }

    public int dfs(int[][] grid, int i, int j, int sum) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        sum = (sum + grid[i][j]) % div;

        if (mt[i][j][sum] != null) {
            return mt[i][j][sum];
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            if (sum % div == 0) {
                return mt[i][j][sum] = 1;
            } else {
                return mt[i][j][sum] = 0;
            }
        }
        return mt[i][j][sum] = (dfs(grid, i + 1, j, sum) + dfs(grid, i, j + 1, sum)) % 1_000_000_007;

    }

}