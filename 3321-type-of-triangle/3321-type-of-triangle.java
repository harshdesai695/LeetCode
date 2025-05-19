class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int setSize = set.size();

        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }

        if (setSize == 1) {
            return "equilateral";
        } else if (setSize == 2) {
            return "isosceles";
        }  else {
            return "scalene";
        }
    }
}