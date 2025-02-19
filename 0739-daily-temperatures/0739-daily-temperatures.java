class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> st = new Stack<int[]>();

        for(int i = temperatures.length-1;i>=0;i--){
            if(st.isEmpty()){
                res[i]=0;
            }

            else if(st.size()>0 && st.peek()[0]>temperatures[i]){
                res[i]=st.peek()[1]-i;
            }
            else if(st.size()>0 && st.peek()[0]<=temperatures[i]){
                while(st.size()>0 && st.peek()[0]<=temperatures[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i]=0;
                }
                else{
                    res[i]=st.peek()[1]-i;
                }
            }
            st.push(new int[]{temperatures[i],i});
        }
        return res;
    }
}