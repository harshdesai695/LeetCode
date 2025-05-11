class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0, j = 0, k = 3;
        List<Integer> lst = new ArrayList<>();
        while (j < arr.length) {
            lst.add(arr[j]);
            int winSize = j - i + 1;
            if (winSize < k) {
                j++;
            } else if (winSize == k) {
                if (lst.get(0) % 2 != 0 && lst.get(1) % 2 != 0 && lst.get(2) % 2 != 0) {
                    return true;
                }else{
                    lst.remove(0);
                    i++;
                    j++;
                }
            }
        }
        return false;
    }
}