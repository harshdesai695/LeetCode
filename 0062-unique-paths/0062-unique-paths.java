class Solution {
    int[][] mt;
    public int uniquePaths(int m, int n) {
        mt = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                mt[i][j] = -1;
            }
        }
        return findPath(0, 0,n,m);
    }

    public int findPath(int i, int j,int n,int m) {
        if (i < 0 || j < 0 || i>n || j>m) {
            return 0;
        }
        if (mt[i][j] != -1) {
            return mt[i][j];
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        return mt[i][j] = findPath(i + 1, j,n,m) + findPath(i, j + 1,n,m);

    }
}