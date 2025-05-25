class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "" + word.charAt(1) + word.charAt(0);
            if (map.getOrDefault(revWord, 0) > 0) {
                map.put(revWord, map.get(revWord) - 1);
                maxLen += 4;
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : map.keySet()) {
            if (key.charAt(0) == key.charAt(1) && map.get(key) > 0) {
                maxLen += 2;
                break;
            }
        }

        return maxLen;

    }
}