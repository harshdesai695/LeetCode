class Solution {
    public String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for (char c : ch) {
            int len = str.length();
            if (len > 0 && str.charAt(len - 1) == c) {
                str.deleteCharAt(len - 1);
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}