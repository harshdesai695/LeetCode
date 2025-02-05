class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // if (target > matrix[m][n]) {
        //     return false;
        // }
        int low = 0;
        int high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / n;
            int clo = mid % n;
            if (target > matrix[row][clo]) {
                low = mid + 1;
            } else if (target < matrix[row][clo]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}