class Solution {
    public int maximumLength(int[] nums) {
        int len = nums.length;

        int cEven = 0;
        int cOdd = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                cEven++;
            } else {
                cOdd++;
            }
        }

        int edp = 0;
        int odp = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                edp = Math.max(edp, odp + 1);
            } else {
                odp = Math.max(odp, edp + 1);
            }
        }

        return Math.max(Math.max(cEven, cOdd), Math.max(edp, odp));
    }
}