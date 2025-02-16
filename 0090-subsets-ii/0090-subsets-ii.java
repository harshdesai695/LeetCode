class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        generateUniqueSubset(0, nums, new ArrayList<>(), map);
        return new ArrayList<>(map.values());
    }

    public void generateUniqueSubset(int index, int[] nums, List<Integer> current, HashMap<String, List<Integer>> map) {
        if (index == nums.length) {
            String key = current.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>(current));
            }
            return;
        }
        generateUniqueSubset(index + 1, nums, current, map);
        current.add(nums[index]);
        generateUniqueSubset(index + 1, nums, current, map);
        current.remove(current.size() - 1);

    }
}