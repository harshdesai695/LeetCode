class Solution {
    public int findKthPositive(int[] arr, int k) {
        int arrlen= arr.length;
        for(int i=0;i<arrlen;i++){
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}