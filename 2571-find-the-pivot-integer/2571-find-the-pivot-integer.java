class Solution {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int[] nums = new int[n];
        int total = ((n * (n + 1) / 2));
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right) {
                return nums[i];
            }
            left = left + nums[i];
        }
        return -1;

    }
}