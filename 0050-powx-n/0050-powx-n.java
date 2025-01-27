class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0; 
        }
        if (n < 0) {
           if (n == Integer.MIN_VALUE) { 
                return 1.0 / (x * myPow(x, Integer.MAX_VALUE)); 
            } else {
                return 1 / myPow(x, -n);
            }
        }

        double temp = myPow(x, n / 2); 
        if (n % 2 == 0) {
            return temp * temp; 
        } else {
            return x * temp * temp; 
        }
    }
}