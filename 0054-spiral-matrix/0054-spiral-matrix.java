class Solution {

    List<Integer> ans = new ArrayList<>();
    int n = 0;
    int m = 0;

    public List<Integer> spiralOrder(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        int totalElement = n * m;
        int startRow = 0;
        int startColumn = 0;
        int endRow = n - 1;
        int endColumn = m - 1;
        while (totalElement != ans.size()) {
            leftToRight(startColumn, endColumn, startRow, matrix);
            startRow++;
            if (totalElement == ans.size()) {
                break;
            }
            topToBottom(startRow, endRow, endColumn, matrix);
            endColumn--;
            if (totalElement == ans.size()) {
                break;
            }
            rightToLeft(startColumn, endColumn, endRow, matrix);
            endRow--;
            if (totalElement == ans.size()) {
                break;
            }
            bottomToTop(startRow, endRow, startColumn, matrix);
            startColumn++;
            if (totalElement == ans.size()) {
                break;
            }
            // System.out.println(ans);
        }

        return ans;

    }

    public void leftToRight(int start, int end, int row, int[][] matrix) {
        for (int i = start; i <= end; i++) {
            ans.add(matrix[row][i]);
        }
    }

    public void topToBottom(int start, int end, int column, int[][] matrix) {
        for (int i = start; i <= end; i++) {
            ans.add(matrix[i][column]);
        }
    }

    public void rightToLeft(int start, int end, int row, int[][] matrix) {
        for (int i = end; i >= start; i--) {
            ans.add(matrix[row][i]);
        }
    }

    public void bottomToTop(int start, int end, int column, int[][] matrix) {
        for (int i = end; i >= start; i--) {
            ans.add(matrix[i][column]);
        }
    }

}