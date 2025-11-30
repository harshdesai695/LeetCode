class Solution {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int negcount = 0, zeroCount = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] < 0) {
                negcount++;
            } else {
                break;
            }
        }
        return Math.max(negcount, len - (negcount + zeroCount));
    }
}