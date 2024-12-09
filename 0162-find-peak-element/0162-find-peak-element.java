class Solution {
    public int findPeakElement(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums.length == 1 || nums[0] > nums[1]) {
                return 0;
            }
            if (nums[high] > nums[high - 1]) {
                return high;
            }
            if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                return mid;
            }
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
}