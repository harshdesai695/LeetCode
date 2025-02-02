class Solution {
    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int low = 0;
        int high = height.length - 1;
        int res = 0;
        int leftMax = height[low];
        int rightMax = height[high];
        while (low < high) {
            if (leftMax < rightMax) {
                low++;
                leftMax = Math.max(leftMax, height[low]);
                res += leftMax - height[low];
            } else {
                high--;
                rightMax = Math.max(rightMax, height[high]);
                res += rightMax - height[high];
            }
        }
        return res;
    }
}