class Solution {

    int waviness = 0;

    public int totalWaviness(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int digit = countDigit(i);
            if (digit < 3) {
                waviness = waviness + 0;
            } else {
                int peakOrValley = findPeakOrValley(i);
                waviness = waviness + peakOrValley;
            }
        }
        return waviness;
    }

    public int findPeakOrValley(int num) {
        int count=0;
        int[] arr = String.valueOf(num).chars().map(c -> c - '0').toArray();
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1] || arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                count++;
            }
        }
        return count;
    }

    public int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

}