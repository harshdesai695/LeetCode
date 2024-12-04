class Solution {
    public int maxSubArray(int[] nums) {
        int arrlen=nums.length;
		int sum=0;
		int maxx=Integer.MIN_VALUE;
		for(int i=0;i<arrlen;i++) {
			sum=sum+nums[i];
			if(sum>maxx) {
				maxx=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
        return maxx;
    }
}