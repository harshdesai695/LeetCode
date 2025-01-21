class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int n = s.length();

        for (int i=0;i<n;i++){
            if(index<spaces.length && i==spaces[index]){
                result.append(" ");
                index++;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}