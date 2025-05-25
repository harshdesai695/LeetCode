class Solution {
    public String resultingString(String s) {

        boolean check = true;
        while (check) {
            Stack<Character> st = new Stack<>();
            boolean removed = false;
            // int i = 1;
            if (s.length() > 0) {
                st.push(s.charAt(0));
            }
            // System.out.println("While Stack->"+st.toString());
            for (int i = 1; i < s.length(); i++) {
                char ch = s.charAt(i);
                // int diff = 0;
                // if (!st.isEmpty()) {
                //     diff = Math.abs(ch - st.peek());
                // }
                int diff = !st.isEmpty() ? Math.abs(ch - st.peek()) : 0;
                // System.out.println("diff"+diff);
                if (diff == 1 || diff == 25) {
                    st.pop();
                    removed = true;
                } else {
                    st.push(ch);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : st) sb.append(c);
            s = sb.toString();
            // s = st.toString().replace("]","").replace("[","");
            // System.out.print(s);
            check = removed;
        }
        return s;
    }
}