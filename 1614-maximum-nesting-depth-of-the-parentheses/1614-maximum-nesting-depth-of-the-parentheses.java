class Solution {
    public int maxDepth(String s) {
        int maxCount = 0;
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
                maxCount = Math.max(maxCount, st.size());
            } else if (ch == ')') {
                st.pop();
            }
        }

        return maxCount;
    }
}