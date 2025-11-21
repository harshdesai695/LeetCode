class Solution {
    public int pivotInteger(int n) {
        int total = (n * (n + 1)) / 2;
        // System.out.println("Total:"+total);
        for (int i = 1; i <= n; i++) {
            int ntotal=(i*(i+1))/2;
            // System.out.println("I:"+i+" ntotal:"+(ntotal));
            if (ntotal == total - ntotal + i) {
                return i;
            }
        }

        return -1;
    }
}