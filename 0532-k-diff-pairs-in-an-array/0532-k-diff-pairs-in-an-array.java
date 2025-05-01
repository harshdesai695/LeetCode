class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        Arrays.sort(nums);
        int i = 0, j = 1;
        int count = 0;
        Set<String> map = new HashSet<>();
        while (j < nums.length) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                map.add(nums[i] + "," + nums[j]);
                i++;
                j++;
            }
        }
        return map.size();
    }
}