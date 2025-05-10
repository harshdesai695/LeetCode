class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }

        int left = 0, count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            left = left + nums[i];
            int right = total - left;
            int diff = Math.abs(left - right);
            // System.out.println("I->" + i);
            // System.out.println("right->" + right);
            // System.out.println("left->" + left);
            // System.out.println("Diff->" + diff);
            // System.out.println("");
            if (diff % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}