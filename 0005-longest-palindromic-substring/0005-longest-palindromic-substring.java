class Solution {
    public String longestPalindrome(String s) {
        int maxLen=0;
        int strLen = s.length();
        String pString="";

        if(strLen==1){
            return s;
        }

        for(int i=0;i<strLen;i++){
            for(int j=i;j<=strLen;j++){
                String subString=s.substring(i,j);
                if(checkPalindrome(subString)){
                    int sLen=subString.length();
                    if(sLen>maxLen){
                        maxLen=sLen;
                        pString=subString;
                    }
                }
            }
        }

        return pString;

    }

    public boolean checkPalindrome(String str) {

        int strLen = str.length();
        for (int i = 0, j = strLen - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}