class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int low=0;
        int high=t.length()-1;
        while(low<=high){
            if(t.charAt(low)!=t.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}