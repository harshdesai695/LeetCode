class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int i = 0, j = 0;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (i = 0; i + k - 1 < len; i++) {
            low = Math.min(low, nums[i + k - 1] - nums[i]);
        }
        return low;
    }
}