class Solution {

    // X,Y
    // X==Y destroy both
    // X!=Y X destroyed and y = y - X   
    // public int lastStoneWeightII(int[] stones) {
    //     int n = stones.length;
    //     int sum = 0;
    //     for (int i : stones) {
    //         sum = sum + i;
    //     }
    //     return recursiveFunction(stones,n,sum,0);
    // }

    // public int recursiveFunction(int[] stones, int n, int sum, int acc) {
    //     if (n == 0) {
    //         return Math.abs(sum - acc);
    //     }
    //     int take = recursiveFunction(stones, n - 1, sum - stones[n - 1], acc + stones[n - 1]);
    //     int notTake = recursiveFunction(stones, n - 1, sum, acc);
    //     return Math.min(take, notTake);

    // }

    int[][] mt;

    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for (int i : stones) {
            sum = sum + i;
        }
        mt = new int[n + 1][sum + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sum; j++) {
                mt[i][j] = -1;
            }
        }
        return recursiveFunction(stones, n, sum, 0);
    }

    public int recursiveFunction(int[] stones, int n, int sum, int acc) {
        if (n == 0) {
            return Math.abs(sum - acc);
        }

        if (mt[n - 1][sum - 1] != -1) {
            return mt[n - 1][sum - 1];
        }

        int take = recursiveFunction(stones, n - 1, sum - stones[n - 1], acc + stones[n - 1]);
        int notTake = recursiveFunction(stones, n - 1, sum, acc);
        return mt[n - 1][sum - 1] = Math.min(take, notTake);

    }

}