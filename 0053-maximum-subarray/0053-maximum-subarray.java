class Solution {
    public int maxSubArray(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
            maxVal=Math.max(maxVal,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxVal;
    }
}