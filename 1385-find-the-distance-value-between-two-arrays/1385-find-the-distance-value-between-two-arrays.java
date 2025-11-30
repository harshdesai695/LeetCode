class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        // Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            int low = 0;
            int high = arr2.length - 1;
            boolean foundCloseElement = false;
            while (low <= high) {
                int mid = ((high - low) / 2) + low;
                if (Math.abs(arr1[i] - arr2[mid]) <= d) {
                    foundCloseElement = true;
                    break;
                }
                if (arr2[mid] < arr1[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (!foundCloseElement) {
                count++;
            }
        }
        return count;
    }
}