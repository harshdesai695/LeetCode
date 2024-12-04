class Solution {
    public int majorityElement(int[] nums) {
        int num = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = count + 1;
                num = nums[i];
            } else if (num == nums[i]) {
                count = count + 1;
            } else {
                count = count - 1;
            }
        }
        return num;
    }
}