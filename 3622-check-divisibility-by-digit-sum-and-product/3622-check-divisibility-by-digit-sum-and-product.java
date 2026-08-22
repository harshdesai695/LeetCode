class Solution {

    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int num = n;
        while (n > 0) {
            int dig = n % 10;
            sum = sum + dig;
            product = product * dig;
            n = n / 10;
        }
        // System.out.println(sum);
        // System.out.println(product);
        return num % (sum + product) == 0;
    }

}