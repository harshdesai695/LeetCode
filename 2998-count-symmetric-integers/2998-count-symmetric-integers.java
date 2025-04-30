class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(countDigit(i)%2==0){
                if(checkInteger(i)){
                    count++;
                }
            }
        }
        return count;
    }

    public int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public boolean checkInteger(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        int f1 = 0;
        int f2 = 0;
        for (int i = 0; i < len / 2; i++) {
            f1 += str.charAt(i) - '0';
        }
        for (int i = len / 2; i < len; i++) {
            f2 += str.charAt(i) - '0';
        }
        return f1==f2;
    }
}