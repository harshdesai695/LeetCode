class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        int j = 0;
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1);

        while (j < nums.length) {
            sum = sum + nums[j];
            if (prefixCount.containsKey(sum - k)) {
                count = count + prefixCount.get(sum - k);
            }
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
            j++;
        }

        return count;
    }
}