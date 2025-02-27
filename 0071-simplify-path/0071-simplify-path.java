class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] ch = (path.split("/"));
        for (int i = 0; i < ch.length; i++) {
            if (ch[i].equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (ch[i].equals("")) {
                continue;
            } else if (!ch[i].isEmpty() && !ch[i].equals(".")) {
                st.push(ch[i]);
            }
        }
        // System.out.print(st);
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, "/" + st.pop());
        }
        return result.length() > 0 ? result.toString() : "/";
    }
}