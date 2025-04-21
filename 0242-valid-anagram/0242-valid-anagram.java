class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sChar=s.charAt(i);
            Character tChar=t.charAt(i);
            if(smap.containsKey(sChar)){
                smap.put(sChar,smap.get(sChar)+1);
            }else{
                smap.put(sChar,1);
            }
            if(tmap.containsKey(tChar)){
                tmap.put(tChar,tmap.get(tChar)+1);
            }else{
                tmap.put(tChar,1);
            }
        }
        return smap.equals(tmap);
    }
}