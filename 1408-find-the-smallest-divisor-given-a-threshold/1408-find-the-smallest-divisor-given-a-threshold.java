class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=findMax(nums);    
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            int sum=findSum(nums,mid);
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public int findMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    public int findSum(int[] arr,int d){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+(int)Math.ceil((double)arr[i]/d);
        }
        return sum;
    }
}