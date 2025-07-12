class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> validNumbers = new HashSet<>();
        boolean[] used = new boolean[digits.length];

        countThreedigit(digits, 0, 0, used, validNumbers);
        return validNumbers.size();
    }

    public void countThreedigit(int[] digits, int len, int n, boolean[] used, Set<Integer> set) {
        if (len == 3) {
            if (n >= 100 && n % 2 == 0) {
                set.add(n);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (used[i]) {
                continue;
            }
            if (len == 0 && digits[i] == 0) {
                continue;
            }

            used[i] = true;
            countThreedigit(digits, len + 1, n * 10 + digits[i], used, set);
            used[i] = false;
        }

    }
}