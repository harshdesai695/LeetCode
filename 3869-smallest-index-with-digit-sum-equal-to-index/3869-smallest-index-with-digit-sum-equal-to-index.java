class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int num = nums[i];
            while (num != 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            if (sum == i) {
                min = Math.min(min, i);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}