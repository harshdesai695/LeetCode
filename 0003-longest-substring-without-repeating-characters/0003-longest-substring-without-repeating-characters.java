class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int i = 0, j = 0;
        int maxLength = 0;
        while (j < s.length()) {
            while (charSet.contains(s.charAt(j))) {
                charSet.remove(s.charAt(i));
                i++;
            }
            charSet.add(s.charAt(j));
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }
        return maxLength;
    }
}