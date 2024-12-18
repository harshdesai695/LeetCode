class Solution {

    public int minDays(int[] bloomDay, int m, int k) {
        
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();

        // Perform binary search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int currentFlowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                currentFlowers++;
                if (currentFlowers == k) {
                    bouquets++;
                    currentFlowers = 0;
                }
            } else {
                currentFlowers = 0;
            }
            if (bouquets >= m) {
                return true;
            }
        }

        return bouquets >= m;
    }
}