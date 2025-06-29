class Solution {
    int[] mt;
    public int rob(int[] nums) {
        mt=new int[nums.length];
        Arrays.fill(mt, -1);
        return rob(nums, nums.length - 1);
    }

    public int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if(mt[i]>=0){
            return mt[i];
        }
        return mt[i]=Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }
}