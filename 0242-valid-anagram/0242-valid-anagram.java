class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> shashMap = new HashMap<>();
        HashMap<Character, Integer> thashMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (shashMap.containsKey(sch)) {
                shashMap.put(sch, shashMap.get(sch) + 1);
            } else {
                shashMap.put(sch, 1);
            }
            if (thashMap.containsKey(tch)) {
                thashMap.put(tch, thashMap.get(tch) + 1);
            } else {
                thashMap.put(tch, 1);
            }
        }
        // System.out.print(shashMap);
        // System.out.print(thashMap);
        return shashMap.equals(thashMap);
    }
}