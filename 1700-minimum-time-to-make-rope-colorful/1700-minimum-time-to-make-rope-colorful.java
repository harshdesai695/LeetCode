class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ttime = 0;
        int prev = neededTime[0];

        for (int i = 1; i < neededTime.length; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                ttime = ttime + Math.min(prev, neededTime[i]);
                prev = Math.max(prev, neededTime[i]);
            } else {
                prev = neededTime[i];
            }
        }
        return ttime;
    }
}