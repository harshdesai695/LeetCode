class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int absDiff = Math.abs(arr[i] - arr[i + 1]);
            if (absDiff < minDiff) {
                minDiff = absDiff;
                ans.clear();
                ans.add(new ArrayList<>(List.of(arr[i], arr[i + 1])));
            } else if (absDiff == minDiff) {
                ans.add(new ArrayList<>(List.of(arr[i], arr[i + 1])));
            }
        }
        return ans;
    }
}