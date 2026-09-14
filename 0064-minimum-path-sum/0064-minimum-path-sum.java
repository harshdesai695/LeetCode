class Solution {
    int[][] mt;

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        mt = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mt[i], -1);
        }
        return findPath(grid, 0, 0);
    }

    public int findPath(int[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        if (mt[i][j] != -1) {
            return mt[i][j];
        }
        int right = findPath(grid, i + 1, j);
        int down = findPath(grid, i, j + 1);
        return mt[i][j] = grid[i][j] + Math.min(right, down);
    }
}