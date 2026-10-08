class Solution {
    Stack<Character> st = new Stack<>();
    StringBuilder ans =  new StringBuilder();
    public String removeOuterParentheses(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    ans.append(ch);
                }
                st.push(ch);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}