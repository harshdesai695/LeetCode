class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int low = 0;
        int high = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            while (low <= high) {
                int mid =low + (high - low) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    high = high - 1;
                } else {
                    low = mid + 1;
                }
            }
            low = 0;
            high = matrix[0].length - 1;
        }
        return false;
    }
}