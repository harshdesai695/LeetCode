class Solution {
    public int countSubstrings(String s) {
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                if(isPalindrome(s.substring(i,j))){
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isPalindrome(String str){
        int len=str.length();
        if(len==1){
            return true;
        }

        int l=0;
        int h=len-1;

        while(l<h){
            if(str.charAt(l)!=str.charAt(h)){
                return false;
            }
            else{
                l++;
                h--;
            }
        }
        return true;
    }
}