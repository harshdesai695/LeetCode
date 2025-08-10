class Solution {
    public boolean reorderedPowerOf2(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(0, n % 10);
            n /= 10;
        }
        return permute(digits, 0);
    }

    public boolean permute(List<Integer> list, int start) {
        if (start == list.size()) {
            if (list.get(0) == 0)
                return false;
            int num = 0;
            for (int digit : list) {
                num = num * 10 + digit;
            }
            return (num & (num - 1)) == 0; 
        }

        for (int i = start; i < list.size(); i++) {
            swap(list, i, start);
            if (permute(list, start + 1)) {
                return true;
            }
            swap(list, i, start);
        }
        return false;
    }

    public void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}