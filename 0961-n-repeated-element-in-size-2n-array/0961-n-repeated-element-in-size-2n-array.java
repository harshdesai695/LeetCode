class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}