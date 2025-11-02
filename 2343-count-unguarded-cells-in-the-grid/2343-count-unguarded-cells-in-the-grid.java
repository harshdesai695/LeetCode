class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int[][] mat = new int[m][n];
        int count=0;

        //1 represents guard
        for (int[] g : guards) {
            mat[g[0]][g[1]] = 1;
        }

        //-1 represents wall
        for (int[] w : walls) {
            mat[w[0]][w[1]] = -1;
        }

        for (int[] g : guards) {
            int r = g[0];
            int c = g[1];

            for (int i = c - 1; i >= 0; i--) {
                if (mat[r][i] == 1 || mat[r][i] == -1) {
                    break;
                }
                if (mat[r][i] == 0) {
                    mat[r][i] = 2;
                }
            }

            for (int i = r - 1; i >= 0; i--) {
                if (mat[i][c] == 1 || mat[i][c] == -1) {
                    break;
                }
                if (mat[i][c] == 0) {
                    mat[i][c] = 2;
                }
            }

            for (int i = c + 1; i < n; i++) {
                if (mat[r][i] == 1 || mat[r][i] == -1) {
                    break;
                }
                if (mat[r][i] == 0) {
                    mat[r][i] = 2;
                }
            }

            for (int i = r + 1; i < m; i++) {
                if (mat[i][c] == 1 || mat[i][c] == -1) {
                    break;
                }
                if (mat[i][c] == 0) {
                    mat[i][c] = 2;
                }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}