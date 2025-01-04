class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();

        for (int i = 0; i <= hlen - nlen; i++) {
            String sString = haystack.substring(i, i + nlen);
            // System.out.print(sString);
            if (sString.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}