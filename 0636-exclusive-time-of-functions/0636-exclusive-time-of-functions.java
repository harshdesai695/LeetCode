class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();
        int prevLogTime = 0;
        for (String s : logs) {
            String[] log = s.split(":");
            if (log[1].equals("start")) {
                if (!stk.isEmpty()) ans[stk.peek()] += Integer.parseInt(log[2]) - prevLogTime;
                stk.push(Integer.parseInt(log[0]));
                prevLogTime = Integer.parseInt(log[2]);
            } else {
                ans[stk.pop()] += Integer.parseInt(log[2]) - prevLogTime + 1;
                prevLogTime = Integer.parseInt(log[2]) + 1;
            }
        }
        return ans;
    }
}