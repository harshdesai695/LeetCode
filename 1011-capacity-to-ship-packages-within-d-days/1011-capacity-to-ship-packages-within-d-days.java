class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = -1;
        int total = 0;
        for (int i : weights) {
            max = Math.max(max, i);
            total = total + i;
        }
        int low = max;
        int high = total;
        while (low < high) {
            int mid = (low + high) / 2;
            int day = 1;
            int curr = 0;
            for (int i : weights) {
                if (curr + i > mid) {
                    day++;
                    curr = 0;
                }
                curr = curr + i;
            }
            if (day > days) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}