class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        int rs = 0;
        int sign = 1;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9')
                break;
            int digit = ch - '0';
            if (rs > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            rs = rs * 10 + digit;
            i++;
        }
        return rs * sign;
    }
}