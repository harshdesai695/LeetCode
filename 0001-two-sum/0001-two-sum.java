class Solution {
    public int[] twoSum(int[] nums, int target) {
		int arrlength=nums.length;
		int[] ans= {0,0};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arrlength;i++) {
			int needed=target-nums[i];
			if(map.containsKey(needed)) {
				System.out.println("{"+map.get(needed)+","+i+"}");
				ans[0]=i;
				ans[1]=map.get(needed);
			}
			map.put(nums[i], i);
		}
		return ans;
    }
}