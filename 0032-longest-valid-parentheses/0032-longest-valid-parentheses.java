class Solution {
    Stack<Integer> st;
    public int longestValidParentheses(String s) {
        st = new Stack<>();
        int n = s.length();
        int maxLen=0;
        if (n == 0) {
            return 0;
        }
        st.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxLen=Math.max(maxLen,i-st.peek());
                }   
            }
        }
        return maxLen;
    }


}