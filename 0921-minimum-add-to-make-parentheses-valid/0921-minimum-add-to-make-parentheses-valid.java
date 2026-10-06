class Solution {
    public int minAddToMakeValid(String s) {
        int openBracket = 0;
        int addCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openBracket++;
            } else {
                if (openBracket > 0) {
                    openBracket--;
                } else {
                    addCount++;
                }
            }
        }
        return openBracket + addCount;
    }
}