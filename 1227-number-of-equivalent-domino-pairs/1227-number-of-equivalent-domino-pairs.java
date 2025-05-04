class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] i : dominoes) {
            // int min = Math.min(i[0], i[1]);
            // int max = Math.max(i[0], i[1]);
            String key = Math.min(i[0], i[1]) + "," + Math.max(i[0], i[1]);
            count += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);

        }
        return count;
    }
}