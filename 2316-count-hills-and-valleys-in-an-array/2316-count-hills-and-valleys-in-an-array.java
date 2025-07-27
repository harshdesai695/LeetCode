class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        lst.add(nums[0]);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                lst.add(nums[i]);
            }
        }
        for (int i = 1; i < lst.size() - 1; i++) {
            int prev = lst.get(i - 1);
            int curr = lst.get(i);
            int next = lst.get(i + 1);
            if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                count++;
            }
        }
        return count;
    }
}