class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int[] tempArray =new int[len];
        int s=0;
        int e=len-1; 
        for(int i=len-1;i>=0;i--){
            if(Math.abs(nums[s])>Math.abs(nums[e])){
                tempArray[i]=nums[s]*nums[s];
                s++;
            }else{
                tempArray[i]=nums[e]*nums[e];
                e--;
            }
        }
        return tempArray;
    }

}