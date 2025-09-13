class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        while (n != 1) {
            if (map.contains(n)) {
                return false;
            }
            map.add(n);
            n = sumSquare(n);
        }
        return true;
    }

    public int sumSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum = sum + (d * d);
        }
        return sum;
    }
}