class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        System.out.println(map);
        int minDist = Integer.MAX_VALUE;
        // Set<Integer> key = map.keySet();
        for (int key : map.keySet()) {
            List<Integer> lst = map.get(key);
            for (int i = 0; i < lst.size(); i++) {
                for (int j = i + 1; j < lst.size(); j++) {
                    for (int k = j + 1; k < lst.size(); k++) {
                        int a = lst.get(i), b = lst.get(j), c = lst.get(k);
                        int dist = Math.abs(a - b) + Math.abs(b - c) + Math.abs(a - c);
                        minDist = Math.min(minDist, dist);
                    }
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}