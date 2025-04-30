class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int lastInvalid = -1;
        int lastMin = -1;
        int lastMax = -1;
        long count = 0;

        for (int j = 0; j < n; j++) {
            // Invalidate if out of range
            if (nums[j] < minK || nums[j] > maxK) {
                lastInvalid = j;
            }

            if (nums[j] == minK) {
                lastMin = j;
            }

            if (nums[j] == maxK) {
                lastMax = j;
            }

            int validStart = Math.min(lastMin, lastMax);

            if (validStart > lastInvalid) {
                count += validStart - lastInvalid;
            }
        }
        return count;
    }
}
    // public boolean allElementsInRange(ArrayList<Integer> arr, int minK, int maxK) {
    //     for (int val : arr) {
    //         if (val < minK || val > maxK)
    //             return false;
    //     }
    //     return true;
    // }

//     public int findMax(ArrayList<Integer> arr) {
//         return Collections.max(arr);
//     }

//     public int findMin(ArrayList<Integer> arr) {
//         return Collections.min(arr);
//     }
// }