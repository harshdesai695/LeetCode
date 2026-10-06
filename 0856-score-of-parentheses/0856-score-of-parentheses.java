class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        // int score = 0;
        st.push(0);
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(0);
            }
            if (ch == ')') {
                int top=st.pop();
                if(top==0){
                    st.push(st.pop()+1);
                }else{
                    st.push(st.pop() + 2 * top);
                }
            }
        }
        return st.pop();
    }
}