class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!sStack.isEmpty()) sStack.pop();
            } else {
                sStack.push(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!tStack.isEmpty()) tStack.pop();
            } else {
                tStack.push(ch);
            }
        }

        return sStack.equals(tStack);
    }
}