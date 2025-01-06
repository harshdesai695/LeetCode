class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length;
        int[] tempArray=new int[len];
        int s=0;
        int end=len-1;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0){
                tempArray[s]=nums[i];
                s++;
            }else{
                tempArray[end]=nums[i];
                end--;
            }
        }
        return tempArray;
    }
}