class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int rem = 0;
        for (int i : nums) {
            rem = ((rem << 1) + i) % 5;
            if (rem == 0) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}