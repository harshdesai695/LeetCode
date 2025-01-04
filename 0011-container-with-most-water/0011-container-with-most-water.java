class Solution {
    public int maxArea(int[] height) {
        int mArea=0;
        int low=0;
        int high=height.length-1;
        while(low<=high){
            int l=Math.min(height[low],height[high]);
            int b=high-low;
            int area=l*b;
            mArea=Math.max(mArea,area);
            if(height[low]<height[high]){
                low=low+1;
            }
            else{
                high=high-1;
            }
        }
        return mArea;
    }
}