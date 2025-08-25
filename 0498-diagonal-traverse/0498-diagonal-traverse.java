class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int idx = 0;

        for (int d = 0; d < (m + n - 1); d++) {
            int row, col;
            List<Integer> temp = new ArrayList<>();
            if (d % 2 == 0) {
                row = (d < m) ? d : m - 1;
                col = d - row;
                while (row >= 0 && col < n) {
                    temp.add(mat[row][col]);
                    row--;
                    col++;
                }
            } else {
                col = (d < n) ? d : n - 1;
                row = d - col;
                while (col >= 0 && row < m) {
                    temp.add(mat[row][col]);
                    row++;
                    col--;
                }
            }

            for (int num : temp) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}