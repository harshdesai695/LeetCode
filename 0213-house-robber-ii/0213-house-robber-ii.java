import java.util.Arrays;

class Solution {
    int[] mt;

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];


        mt = new int[nums.length];
        Arrays.fill(mt, -1);
        int max1 = rob(nums, 0, nums.length - 2);

        mt = new int[nums.length];
        Arrays.fill(mt, -1);
        int max2 = rob(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    public int rob(int[] nums, int i, int end) {
        if (i > end) {
            return 0;
        }
        if (mt[i] >= 0) {
            return mt[i];
        }
        return mt[i] = Math.max(rob(nums, i + 2, end) + nums[i], rob(nums, i + 1, end));
    }
}
