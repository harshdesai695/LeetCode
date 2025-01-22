class Solution {
    public void duplicateZeros(int[] arr) {
        int arrLen = arr.length;
        int countZeros = 0;
        
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] == 0) {
                countZeros++;
            }
        }

        int i = arrLen - 1; 
        int j = arrLen + countZeros - 1; 
        
        while (i >= 0) {
            if (j < arrLen) {
                arr[j] = arr[i]; 
            }
            if (arr[i] == 0) {
                j--; 
                if (j < arrLen) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}
