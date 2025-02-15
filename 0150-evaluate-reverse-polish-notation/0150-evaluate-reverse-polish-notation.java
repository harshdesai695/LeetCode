class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                st.push(Integer.parseInt(token));
            } else {
                int b = st.pop(); 
                int a = st.pop(); 
                int result = eval(a, b, token.charAt(0));
                st.push(result);
            }
        }

        return st.pop();
    }

    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int eval(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}