class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0,zeroCount=0;
        for (int i : nums) {
            sum += i;
            if (i == 0) {
                zeroCount++;
            }

        }
        if (Math.abs(target) > sum || (target + sum) % 2 != 0) {
            return 0;
        }

        int newTarget = (target + sum) / 2;
        int subsetCount = SubSetSum(nums, newTarget);
        return subsetCount * (int)Math.pow(2, zeroCount);
    }

    public static int SubSetSum(int[] arr, int sum) {
        int n = arr.length;
        int[][] mt = new int[n + 1][sum + 1];

        // Step-1 Init Matrix
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    mt[i][j] = 1;
                } else if (i == 0) {
                    mt[i][j] = 0;
                }
            }
        }

        // Step-2 Iterative Method
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    mt[i][j] = mt[i - 1][j] + mt[i - 1][j - arr[i - 1]];
                } else {
                    mt[i][j] = mt[i - 1][j];
                }
            }
        }

        return mt[n][sum];
    }
}