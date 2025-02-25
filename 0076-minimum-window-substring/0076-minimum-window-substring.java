class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // System.out.print(map);

        int required = map.size();
        int i = 0, j = 0;
        int minLength = Integer.MAX_VALUE;
        String res = "";

        while (j < s.length()) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    required--;
                }
            }

            while (required == 0) {
                int winSize = j - i + 1;
                if (minLength > winSize) {
                    minLength = winSize;
                    res = s.substring(i, j + 1);
                }
                char leftChar = s.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        required++;
                    }
                }
                i++;
            }
            j++;

        }

        return res;

    }
}