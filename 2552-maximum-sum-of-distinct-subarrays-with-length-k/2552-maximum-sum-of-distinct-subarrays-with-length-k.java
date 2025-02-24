import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) {
            return 0;
        }
        long maxSum = 0 ,sum = 0;
        int i = 0;
        HashSet<Integer> window = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            while (window.contains(nums[j])) {
                window.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            window.add(nums[j]);
            sum += nums[j];
            if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                window.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }

        return maxSum;
    }
}
