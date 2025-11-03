class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            lastIndex[arr[i] - 'a'] = i;
        }
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (seen[c - 'a'])
            {
                continue;
            }
            while (!stk.isEmpty() && c < stk.peek() && lastIndex[stk.peek() - 'a'] > i) {
                seen[stk.pop() - 'a'] = false;
            }

            stk.push(c);
            seen[c - 'a'] = true;
        }

        StringBuilder str = new StringBuilder();
        for (char ch : stk)
        {
            str.append(ch);
        }
        return str.toString();
    }
}