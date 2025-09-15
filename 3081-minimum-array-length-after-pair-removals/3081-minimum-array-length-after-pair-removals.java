class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n=nums.size();
        int mid=n/2;

        int high=n-1;
        int low=mid-1;
        int count=0;

        while(low>=0){
            if(nums.get(high)>nums.get(low)){
                count+=2;
                high--;
            }
            low--;
        }
        return n-count;
    }
}