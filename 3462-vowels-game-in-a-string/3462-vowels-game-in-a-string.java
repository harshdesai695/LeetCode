class Solution {
    public boolean doesAliceWin(String s) {
        return countVowels(s)>0?true:false;
    }

    public int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        int count = 0;
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}