class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] tempArray = new int[len];
        int s = 0;
        int end = 1;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                if (nums[i] % 2 == 0) {
                    tempArray[s] = nums[i];
                    s = s + 2;
                } else {
                    tempArray[end] = nums[i];
                    end = end + 2;
                }
            } else {
                if (nums[i] % 2 != 0) {
                    tempArray[end] = nums[i];
                    end = end + 2;
                } else {
                    tempArray[s] = nums[i];
                    s = s + 2;
                }
            }
        }
        return tempArray;
    }
}