class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int idx = 0;
        int[] ans = new int[2];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans[idx] = entry.getKey();
                idx++;
                // return entry.getKey();
            }
        }
        return ans;
    }
}