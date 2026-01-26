class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            // int absDiff = Math.abs(arr[i] - arr[i + 1]);
            int absDiff = arr[i + 1]-arr[i];
            if (absDiff < minDiff) {
                minDiff = absDiff;
                ans.clear();
            } 
            
            if (absDiff == minDiff) {
                List<Integer> pair = new ArrayList<>(2);
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }
        return ans;
    }
}