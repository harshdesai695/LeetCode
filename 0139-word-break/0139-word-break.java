class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n= s.length();
        boolean[] mt = new boolean[n+1];
        mt[0]=true;
        int maxLen=0;
        for(String word:wordDict){
            maxLen=Math.max(maxLen,word.length());
        }
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(i-maxLen-1,0);j--){
                if(mt[j] && wordDict.contains(s.substring(j,i))){
                    mt[i]=true;
                    break;
                }
            }
        }
        return mt[n];
    }
}