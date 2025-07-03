class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x + y < target) {
            return false;
        }
        int temp;
        if (x > y) {
            temp = x;
        } else {
            temp = y;
        }
        int max=0;
        for(int i=1;i<=temp;i++){
            if(x%i==0 && y%i==0){
                max=Math.max(i,max);
            }
        }
        if(target%max==0){
            return true;
        }
        return false;
    }
}