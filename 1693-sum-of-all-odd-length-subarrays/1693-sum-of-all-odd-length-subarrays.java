class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            int l = i + 1;
            int r = arr.length - i;

            int subArrays = l * r;
            int oddCount = (subArrays + 1) / 2;

            total += arr[i] * oddCount;
        }
        return total;
    }
}