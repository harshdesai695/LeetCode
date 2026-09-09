class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxLen = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            while (set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);
            j++;
        }
        return maxLen;
    }
}
