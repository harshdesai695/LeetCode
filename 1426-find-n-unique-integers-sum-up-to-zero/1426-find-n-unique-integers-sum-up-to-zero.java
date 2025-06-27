class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int indx=0;
        for (int i = 1; i <= n/2; i++) {
            ans[indx++] = i;
            ans[indx++] = -(i);
        }

        if(n%2!=0){
            ans[indx]=0;
        }

        return ans;

    }
}