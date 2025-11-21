class Solution {
    public boolean isPalindrome(int x) {
        long res = 0;
        int temp=x;

        if(x<0){
            return false;
        }

        while (x != 0) {
            int digit = x % 10;
            res = (res * 10) + digit;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return false;
        }

        return (int) res == temp;
    }
}