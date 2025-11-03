class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int res = 0;
        int i = 1;

        while (num1 > 0 || num2 > 0 || num3 > 0) {
            int tempMin = Math.min((num1 % 10), (num2 % 10));
            tempMin = Math.min(tempMin, (num3 % 10));
            res = res + (i * tempMin);
            i = i * 10;
            num1 = num1 / 10;
            num2 = num2 / 10;
            num3 = num3 / 10;
        }
        return res;
    }
}