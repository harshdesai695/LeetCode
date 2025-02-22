class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int maxCount = 0, currentCount = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        while (j < s.length()) {
            if (vowels.contains(s.charAt(j))) {
                currentCount++;
            }

            int winSize = j - i + 1;
            if (winSize < k) {
                j++;
            } else if (winSize == k) {
                maxCount = Math.max(maxCount, currentCount);
                if (vowels.contains(s.charAt(i))) {
                    currentCount--;
                }
                i++;
                j++;
            }
        }
        return maxCount;
    }

    // private int countVowels(String subset) {
    //     Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    //     int count = 0;
    //     for (char c : subset.toCharArray()) {
    //         if (vowels.contains(c)) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}