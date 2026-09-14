class Solution {
    int[][] mt;

    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;
        mt = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mt[i], -1);
        }
        return calculateHealth(dungeon, 0, 0);
    }

    public int calculateHealth(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return Math.max(1, 1 - grid[i][j]);
        }
        if (mt[i][j] != -1) {
            return mt[i][j];
        }
        int down=calculateHealth(grid,i+1,j);
        int right=calculateHealth(grid,i,j+1);
        int minHealthNext = Math.min(right, down);
        mt[i][j] = Math.max(1, minHealthNext - grid[i][j]);
        return mt[i][j];

    }
}