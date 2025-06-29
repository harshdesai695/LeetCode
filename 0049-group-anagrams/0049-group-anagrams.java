class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] stringArray = stringToIndex(str);
            String key = Arrays.toString(stringArray);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
            }
        }
        ans.addAll(map.values());
        return ans;
    }

    public int[] stringToIndex(String str) {

        if (str == null) {
            return null;
        }
        int[] indexArray = new int[26];
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                indexArray[ch - 'a']++;
            }
        }
        return indexArray;
    }
}