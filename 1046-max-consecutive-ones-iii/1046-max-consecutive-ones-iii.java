class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int maxCount=0,count=0;
        while(j<nums.length){
            if(nums[j]==0){
                count++;
            }
            while (count > k) {  
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }
            maxCount=Math.max(maxCount,(j-i+1));
            j++;
        }
        return maxCount;
    }
}