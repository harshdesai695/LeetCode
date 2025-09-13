class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vMap = new HashMap<>();
        vMap.put('a', 0);
        vMap.put('e', 0);
        vMap.put('i', 0);
        vMap.put('o', 0);
        vMap.put('u', 0);
        HashMap<Character, Integer> cMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vMap.containsKey(ch)) {
                vMap.put(ch, vMap.get(ch) + 1);
            } else {
                if (cMap.containsKey(ch)) {
                    cMap.put(ch, cMap.get(ch) + 1);
                } else {
                    cMap.put(ch, 1);
                }
            }
        }
        // System.out.println("VMap");
        // System.out.println(vMap);
        // System.out.println("CMap");
        // System.out.println(cMap);
        int vMax = 0;
        int cMax = 0;
        if (!vMap.isEmpty()) {
            Map.Entry<Character, Integer> vMaxEntry = Collections.max(vMap.entrySet(), Map.Entry.comparingByValue());
            vMax = vMaxEntry.getValue();
        }
        if (!cMap.isEmpty()) {
            Map.Entry<Character, Integer> cMaxEntry = Collections.max(cMap.entrySet(), Map.Entry.comparingByValue());
            cMax = cMaxEntry.getValue();
        }

        return vMax + cMax;

    }
}