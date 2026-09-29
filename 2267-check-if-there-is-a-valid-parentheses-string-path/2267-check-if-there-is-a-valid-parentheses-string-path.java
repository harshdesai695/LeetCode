class Solution {

    Boolean[][][] mt;

    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        mt = new Boolean[n][m][n + m];
        return check(grid, 0, 0, n, m, 0);
    }

    public boolean check(char[][] grid, int i, int j, int n, int m, int count) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }

        // if (grid[i][j] == '(') {
        //     openCount++;
        // }

        // if (grid[i][j] == ')') {
        //     closeCount++;
        // }

        if (grid[i][j] == '(') {
            count++;
        } else {
            count--;
        }

        if (count < 0) {
            return false;
        }

        if (mt[i][j][count] != null) {
            return mt[i][j][count];
        }
        if (i == n - 1 && j == m - 1) {
            return mt[i][j][count] = (count == 0);
        }
        // if (i == n - 1 && j == m - 1) {
        //     if (openCount == closeCount) {
        //         return true;
        //     } else {
        //         return false;
        //     }
        // }

        return mt[i][j][count] = check(grid, i + 1, j, n, m, count) || check(grid, i, j + 1, n, m, count);
    }
}