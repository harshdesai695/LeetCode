class Solution {
    int n;
    int m;
    int noOfWays = 0;
    int[][] mt;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        n = obstacleGrid.length;
        m = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[n - 1][m - 1] == 1) {
            return 0;
        }
        mt = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                mt[i][j] = -1;
            }
        }
        return findPath(obstacleGrid, 0, 0);
    }

    public int findPath(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == 1) {
            return 0;
        }

        if (mt[i][j] != -1) {
            return mt[i][j];
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        return mt[i][j] = findPath(grid, i + 1, j) + findPath(grid, i, j + 1);

    }

}