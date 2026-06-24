class Solution {
    public int minimumCost(int[] cost) {
        int totalCost = 0;
        Arrays.sort(cost);
        for (int i = cost.length - 1; i >= 0; i-=3) {
            totalCost=totalCost+cost[i];
            if(i-1>=0){
                totalCost=totalCost+cost[i-1];
            }
        }
        return totalCost;
    }
}