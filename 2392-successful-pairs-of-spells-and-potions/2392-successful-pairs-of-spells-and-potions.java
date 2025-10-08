class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int low = 0, high = potions.length - 1, count = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    high = mid - 1;
                    count = potions.length - mid;
                } else {
                    low = mid + 1;
                }
            }
            result[i] = count;
        }
        return result;
    }
}