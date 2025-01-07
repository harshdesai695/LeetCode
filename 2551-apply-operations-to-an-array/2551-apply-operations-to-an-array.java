class Solution {
    public int[] applyOperations(int[] nums) {
        int arrlen=nums.length;
        int[] tempNums=new int[arrlen];
        for(int i=0;i<arrlen-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int s=0;
        int e=arrlen-1;
        for(int i=0;i<arrlen;i++){
            if(nums[i]!=0){
                tempNums[s]=nums[i];
                s++;
            }else{
                tempNums[e]=nums[i];
                e--;
            }
        }
        return tempNums;
    }   
}