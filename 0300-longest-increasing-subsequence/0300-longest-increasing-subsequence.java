class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i : nums) {
            if (res.isEmpty() || res.get(res.size() - 1) < i) {
                res.add(i);
            } else {
                int idx = bs(res, i);
                res.set(idx, i);
            }
        }
        return res.size();
    }

    public int bs(List<Integer> arr, int target) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}