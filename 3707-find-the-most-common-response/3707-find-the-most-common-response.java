class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < responses.size(); i++) {
            int len = responses.get(i).size();
            HashSet<String> set = new HashSet<String>();
            for (int j = 0; j < len; j++)
            {
                set.add(responses.get(i).get(j));
            }
            for (String s : set){
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        // System.out.println(map);
        String maxKey = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxKey = entry.getKey();
            } else if (entry.getValue() == maxCount) {
                if (entry.getKey().compareTo(maxKey) < 0) {
                    maxKey = entry.getKey();
                }
            }
        }
        return maxKey;
    }
}