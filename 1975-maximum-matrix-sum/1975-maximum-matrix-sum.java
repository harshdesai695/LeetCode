class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int neg = 0;
        int minAbs = Integer.MAX_VALUE;
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int mt = matrix[i][j];
                ans = ans + Math.abs(mt);
                if (mt < 0) {
                    neg++;
                }
                minAbs = Math.min(minAbs, Math.abs(mt));
            }
        }
        if (neg % 2 == 0) {
            return ans;
        } else {
            return ans - (2 * minAbs);
        }
    }
}