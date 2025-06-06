class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = { 0, 0 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                ans[0]=i;
                ans[1]=map.get(diff);
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}