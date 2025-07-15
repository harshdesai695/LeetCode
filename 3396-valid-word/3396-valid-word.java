class Solution {
    public boolean isValid(String word) {

        boolean isAlphanumeric = word.matches("[a-zA-Z0-9]+");
        boolean hasVowel = word.matches(".*[aeiouAEIOU].*");
        boolean hasConsonant = word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*");

        if (isAlphanumeric && hasVowel && hasConsonant && word.length() >= 3) {
            return true;
        } else {
            return false;
        }

    }
}