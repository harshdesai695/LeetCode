class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int d1 = digits[i];
                    int d2 = digits[j];
                    int d3 = digits[k];
                    if (d1 == 0) {
                        continue;
                    }
                    if (d3 % 2 != 0) {
                        continue;
                    }

                    int num = d1 * 100 + d2 * 10 + d3;
                    resultSet.add(num);
                }
            }
        }
        int[] result = resultSet.stream().sorted().mapToInt(i -> i).toArray();
        return result;
    }
}