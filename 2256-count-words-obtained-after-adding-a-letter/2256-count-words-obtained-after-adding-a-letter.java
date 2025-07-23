class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        Set<String> set = new HashSet<>();
        for (String str : startWords) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            set.add(new String(ch));
        }

        int cnt = 0;
        for (String str : targetWords) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String newStr = new String(ch);
            for (int i = 0; i < newStr.length(); i++) {
                String prev = newStr.substring(0, i) + newStr.substring(i + 1);
                if (set.contains(prev)) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}