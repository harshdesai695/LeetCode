class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> bracket=new HashMap<>();
        bracket.put(')', '(');
        bracket.put(']', '[');
        bracket.put('}', '{');

        for (char i : s.toCharArray()){
            if(bracket.containsKey(i)){
                if(!stack.isEmpty() && stack.peek()==bracket.get(i)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(i);
            }
        }
        return stack.isEmpty();

    }
}