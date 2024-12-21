class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[n]=0;
        dp[n-1]=cost[n-1];
        return Math.min(costing(cost, 0,dp), costing(cost, 1,dp));
    }

    public int costing(int[] cost, int index,int[] dp) {
        int n = cost.length;

        if (index == n) {
            return 0;
        }
        if (index == n - 1) {
            return cost[n - 1];
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int step1 = cost[index] + costing(cost, index + 1,dp);
        int step2 = cost[index] + costing(cost, index + 2,dp);
        return dp[index]=Math.min(step1, step2);
    }
}