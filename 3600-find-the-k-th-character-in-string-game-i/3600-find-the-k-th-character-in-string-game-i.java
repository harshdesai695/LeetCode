class Solution {
    public char kthCharacter(int k) {
        String ans=recursiveFunction("a",k);
        return ans.charAt(0);
    }

    public static String recursiveFunction(String input, int k) {
        if (input.length() >= k) {
            return String.valueOf(input.charAt(k-1));
        } else {
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                result.append(c).append((char) (c + 1));
            }
            return recursiveFunction(result.toString(),k);
        }
    }
}