class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.trim().split(" ");
        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i]+",");
        // }
        // System.out.println("\n"+str[str.length-1]);
        return (str[str.length-1]).length();
    }
}