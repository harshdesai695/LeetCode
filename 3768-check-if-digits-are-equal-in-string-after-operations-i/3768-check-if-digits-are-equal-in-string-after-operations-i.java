class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int i = 0;
        // int j=1;
        while (s.length() != 2) {
            String ans = "";
            while (i < s.length() - 1) {
                ans = ans + Integer.toString(((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10);
                // System.out.println("ans:" + ans);
                i++;
            }
            s = ans;
            i = 0;
            // System.out.println("s:" + s);
        }
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
            return true;
        }

        return false;

    }
}