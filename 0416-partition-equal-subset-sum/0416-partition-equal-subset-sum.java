class Solution {
    boolean[][] mt;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i : nums) {
            sum = sum + i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        mt = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    mt[i][j] = true;
                } else if (i == 0) {
                    mt[i][j] = false;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    mt[i][j] = mt[i-1][j-nums[i-1]] || mt[i-1][j];
                    // (nums, sum - nums[i - 1], i - 1) || (nums, sum, i - 1);
                } else {
                    mt[i][j] = mt[i-1][j];
                }
            }
        }

        return mt[n][sum];
    }

    // public boolean partition(int[] nums, int target, int n) {
    //     if (n == 0) {
    //         return false;
    //     }
    //     if (target == 0) {
    //         return true;
    //     }
    //     if (mt[n][target] != -1) {
    //         return mt[n][target];
    //     }
    //     if (nums[n - 1] <= target) {
    //         return mt[n][target] = partition(nums, target - nums[n - 1], n - 1) || partition(nums, target, n - 1);
    //     } else {
    //         return mt[n][target] = partition(nums, target, n - 1);
    //     }
    // }
}