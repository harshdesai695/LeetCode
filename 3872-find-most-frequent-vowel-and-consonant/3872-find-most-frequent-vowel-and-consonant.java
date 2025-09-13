class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', (int) 'a');
        map.put('e', (int) 'e');
        map.put('i', (int) 'i');
        map.put('o', (int) 'o');
        map.put('u', (int) 'u');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int vMax = 0, cMax = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if(map.containsKey(ch)){
                vMax=Math.max(vMax,freq[i]);
            }else{
                cMax=Math.max(cMax,freq[i]);
            }
        }

        return vMax+cMax;
    }
}