class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                idx = i;
            }
        }
        // System.out.println("max:"+max+"idx:"+idx);
        for (int i : nums) {
            if (i == max) {
                continue;
            }
            if (max < i * 2) {
                return -1;
            }
        }
        return idx;
    }
}