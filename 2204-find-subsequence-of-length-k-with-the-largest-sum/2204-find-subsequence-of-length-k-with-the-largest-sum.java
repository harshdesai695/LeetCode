class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        int[][] newNums = new int[n][2];

        for (int i = 0; i < n; i++) {
            newNums[i][0] = nums[i];
            newNums[i][1] = i;
        }

        Arrays.sort(newNums, (a, b) -> b[0] - a[0]);
        Arrays.sort(newNums, 0, k, Comparator.comparingInt(a -> a[1]));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = newNums[i][0];
        }
        return result;
    }
}