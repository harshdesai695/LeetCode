class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 0;
        int len = nums.length;

        while (i + 1 < len && nums[i + 1] > nums[i]) {
            i++;
        }
        ;
        int p = i;
        while (i + 1 < len && nums[i + 1] < nums[i]) {
            i++;
        }
        int q = i;
        while (i + 1 < len && nums[i + 1] > nums[i]) {
            i++;
        }
        if (i == len - 1 && p > 0 && q > p && q < len - 1) {
            return true;
        }
        return false;
    }
}