class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> intSet = new HashSet<>();
        int i = 0, j = 0;
        int maxSum = 0;
        int sum = 0;
        while (j < nums.length) {
            while (intSet.contains(nums[j])) {
                intSet.remove(nums[i]);
                sum = sum - nums[i];
                i++;
            }
            intSet.add(nums[j]);
            sum = sum + nums[j];
            maxSum = Math.max(maxSum, sum);
            j++;
        }
        return maxSum;

    }
}