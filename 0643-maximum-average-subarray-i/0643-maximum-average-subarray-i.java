class Solution {
    public double findMaxAverage(int[] nums, int k) {

        if(nums.length==1){
            return nums[0];
        }

        int i = 0;
        int j = 0;
        int count = 0;
        double sum = 0.0;
        double maxAvg = Double.NEGATIVE_INFINITY ;

        while (j < nums.length) {
            sum = sum + nums[j];
            int winSize = (j - i + 1);
            if (winSize < k) {
                j++;
            } else if (winSize == k) {
                double avg = (sum / k);
                maxAvg = Math.max(maxAvg, avg);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return maxAvg;
    }
}