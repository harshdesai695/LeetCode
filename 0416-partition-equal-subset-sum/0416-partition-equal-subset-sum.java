class Solution {
    public boolean canPartition(int[] nums) {
        long sum = 0;

        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        } else {
            return SubSet(nums, (int) sum / 2);
        }

    }

    public static boolean SubSet(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] mt = new boolean[n + 1][sum + 1];

        // Step-1 Init Matrix
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    mt[i][j] = true;
                } else if (i == 0) {
                    mt[i][j] = false;
                }
            }
        }

        // Step-2 Iterative Method
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    mt[i][j] = mt[i - 1][j] || mt[i - 1][j - arr[i - 1]];
                } else {
                    mt[i][j] = mt[i - 1][j];
                }
            }
        }

        return mt[n][sum];
    }

}