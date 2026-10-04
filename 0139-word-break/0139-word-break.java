class Solution {
    HashSet<String> set;
    Boolean[] mt;

    public boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);
        mt = new Boolean[s.length() + 1];
        return recursive(s, 0);
    }

    public boolean recursive(String s, int i) {
        if (i == s.length()) {
            return true;
        }

        if (mt[i] != null) {
            return mt[i];
        }

        for (int j = i + 1; j <= s.length(); j++) {
            String word = s.substring(i, j);
            if (set.contains(word)) {
                if (recursive(s, j)) {
                    return mt[i] = true;
                }
            }
        }
        return mt[i] = false;
    }
}