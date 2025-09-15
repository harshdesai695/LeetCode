class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            boolean flag = true;
            for(char ch:brokenLetters.toCharArray()){
                if(words[i].indexOf(ch)!=-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}