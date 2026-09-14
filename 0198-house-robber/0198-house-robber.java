class Solution {
    int[] mt;
    public int rob(int[] nums) {
        mt = new int[nums.length+1];
        Arrays.fill(mt,-1);
        return robHouse(nums, nums.length-1);
    }

    public int robHouse(int[] nums,int n){
        if(n<0){
            return 0;
        }
        if(mt[n]!=-1){
            return mt[n];
        }
        return mt[n]=Math.max((nums[n]+robHouse(nums,n-2)),robHouse(nums,n-1));
    }
}