class Solution {

    public boolean canPlace(int[] nums, int mid, int k) {
        int count = 1;
        int l_Pos = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - l_Pos >= mid) {
                count++;
                l_Pos = nums[i];
                if (count >= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1] - position[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (canPlace(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}