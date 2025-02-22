class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int slen=Integer.MAX_VALUE;
        int sum=0;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                slen=Math.min(slen,(j-i+1));
                sum -= nums[i];
                i++;
                // j++;
            }
            j++;
        }
        return  (slen == Integer.MAX_VALUE) ? 0 : slen;
    }
}