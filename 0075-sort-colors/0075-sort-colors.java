class Solution {
    public void sortColors(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        int temp;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}