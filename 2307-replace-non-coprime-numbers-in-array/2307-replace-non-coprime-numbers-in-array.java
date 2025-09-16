class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        // for (int n : nums) {
        //     arr.add(n);
        // }
        // return arr;
        for (int n : nums) {
            int currentNum = n;
            while (!arr.isEmpty() && gcd(currentNum, arr.get(arr.size() - 1)) > 1) {
                int last = arr.remove(arr.size() - 1);
                currentNum = lcm(currentNum, last);
            }
            arr.add(currentNum);
        }
        return arr;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        return a * (b / gcd(a, b));
    }
}