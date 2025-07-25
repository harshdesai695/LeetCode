class Solution {
    public int maxSum(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i : set) {
            if (i > 0) {
                max = max + i;
            }
        }
        if (max == 0) {
            max = Collections.max(set);
        }
        return max;
    }
}