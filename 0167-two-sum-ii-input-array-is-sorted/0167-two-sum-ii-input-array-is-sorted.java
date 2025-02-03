class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int[] ans={0,0};
        int high=numbers.length-1;
        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum>target){
                high--;
            }
            else if(sum<target){
                low++;
            }
            else{
                ans[0]=low+1;
                ans[1]=high+1;
                return ans;
            }
        }
        return ans;
    }
}