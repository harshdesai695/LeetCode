class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        for(int i:nums){
            if(!map.containsKey(i)){
                int left=map.getOrDefault(i-1,0);
                int right=map.getOrDefault(i+1,0);
                int len=left+right+1;
                map.put(i,len);
                map.put(i-left,len);
                map.put(i+right,len);
                ans=Integer.max(ans,len);
            }
        }
        return ans;
    }
}