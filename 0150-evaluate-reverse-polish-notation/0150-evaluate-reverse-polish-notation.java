import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                String n2 = st.pop();
                String n1 = st.pop();
                st.push(evalution(n1, n2, token));
            } else {
                st.push(token);
            }
        }
        return Integer.parseInt(st.peek());
    }

    public String evalution(String n1, String n2, String operation) {
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int ans = 0;

        if (operation.equals("+")) {
            ans = num1 + num2;
        } else if (operation.equals("-")) {
            ans = num1 - num2;
        } else if (operation.equals("/")) {
            ans = num1 / num2;   
        } else if (operation.equals("*")) {
            ans = num1 * num2;
        }

        return Integer.toString(ans);
    }
}
