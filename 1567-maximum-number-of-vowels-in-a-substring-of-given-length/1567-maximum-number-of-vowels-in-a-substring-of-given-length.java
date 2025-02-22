class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxCount = 0, currentCount = 0;
        
        // Compute vowel count for first window of size k
        for (int j = 0; j < k; j++) {
            if (vowels.contains(s.charAt(j))) {
                currentCount++;
            }
        }
        maxCount = currentCount;

        // Sliding window
        for (int j = k; j < s.length(); j++) {
            if (vowels.contains(s.charAt(j))) {
                currentCount++; // Include new character
            }
            if (vowels.contains(s.charAt(j - k))) {
                currentCount--; // Remove old character
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        
        return maxCount;
    }
}
