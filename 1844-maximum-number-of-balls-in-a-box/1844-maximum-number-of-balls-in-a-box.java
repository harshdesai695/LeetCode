class Solution {
    public int countBalls(int lowLimit, int highLimit) {
                Map<Integer, Integer> boxCount = new HashMap<>();
        int maxBalls = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0, num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            boxCount.put(sum, boxCount.getOrDefault(sum, 0) + 1);
            maxBalls = Math.max(maxBalls, boxCount.get(sum));
        }

        return maxBalls;
    }
}