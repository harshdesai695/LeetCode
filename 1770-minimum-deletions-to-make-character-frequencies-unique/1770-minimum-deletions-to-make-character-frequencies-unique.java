class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Integer> freqMap = new HashSet<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // System.out.println(map);
        int noofdeletion=0;
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            while (freq > 0 && freqMap.contains(freq)) {
                freq--;
                noofdeletion++;
            }

            if (freq > 0) {
                freqMap.add(freq);
            }
        }

        return noofdeletion;
    }
}