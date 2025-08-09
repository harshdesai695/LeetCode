class Solution {
    public int maxBalancedShipments(int[] weight) {
        int mx = weight[0];
        int count = 0;
        for (int i = 1; i < weight.length; i++) {
            if (weight[i] < mx) {
                // mx = weight[i];
                count++;
                if (i + 1 < weight.length) {
                    mx = weight[i + 1];
                    i++; 
                }
            } else {
                mx = Math.max(mx, weight[i]);
            }
        }
        return count;
    }
}