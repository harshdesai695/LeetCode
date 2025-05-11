class Solution {
    public int minDeletion(String s, int k) {
        int delCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        if (map.size() <= k) {
            return 0;
        }
        System.out.print(map);

        List<Integer> frequencies = new ArrayList<>(map.values());
        Collections.sort(frequencies);
        int extra = map.size() - k;
        for (int i = 0; i < extra; i++) {
            delCount += frequencies.get(i);
        }
        return delCount;
    }
}