import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums); // Sort to handle duplicates
        generateUniqueSubset(0, nums, new ArrayList<>(), map);
        return new ArrayList<>(map.values()); // Convert HashMap values to List
    }

    private void generateUniqueSubset(int index, int[] nums, List<Integer> current, HashMap<String, List<Integer>> map) {
        if (index == nums.length) {
            String key = current.toString(); // Convert subset to String key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>(current)); // Store a copy of the subset
            }
            return;
        }

        // Exclude the current element
        generateUniqueSubset(index + 1, nums, current, map);

        // Include the current element
        current.add(nums[index]);
        generateUniqueSubset(index + 1, nums, current, map);

        // Backtrack
        current.remove(current.size() - 1);
    }
}
