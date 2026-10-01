class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (char i : s.toCharArray()) {
            if (map.containsKey(i)) {
                if (!st.isEmpty() && st.peek() == map.get(i)) {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                st.push(i);
            }
        }
        return st.isEmpty();

    }
}