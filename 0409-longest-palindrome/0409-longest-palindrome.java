class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.contains(ch)) {
                map.remove(ch);
                maxLen += 2;
            } else {
                map.add(ch);
            }
        }

        if(!map.isEmpty()){
            maxLen+=1;
        }

        return maxLen;
    }
}