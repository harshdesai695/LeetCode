class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                res[st.peek()]=i-st.pop();
            }
            st.push(i);
        }

        return res;
    }
}