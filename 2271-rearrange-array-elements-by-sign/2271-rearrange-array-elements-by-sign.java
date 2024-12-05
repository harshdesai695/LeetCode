class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arrlen=nums.length;
		int[] ans=new int[arrlen];	
		int pos=0,neg=1;
		for(int i=0;i<arrlen;i++) {
			if(nums[i]<0) {
				ans[neg]=nums[i];
				neg+=2;
			}
			else if(nums[i]>0) {
				ans[pos]= nums[i];
				pos+=2;
			}
		}
        return ans;
    }
}