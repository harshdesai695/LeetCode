class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int nlen = needle.length();
        int i = 0;
        int j = nlen;
        while (j <= haystack.length()) {
            String sString = haystack.substring(i, j);
            // System.out.println(sString);
            if (sString.equals(needle)) {
                return i;
            } else {
                i++;
                j++;
                // System.out.println("i->"+i);
                // System.out.println("j->"+j);
            }
        }

        return -1;
    }
}