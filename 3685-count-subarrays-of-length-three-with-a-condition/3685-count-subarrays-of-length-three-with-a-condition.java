class Solution {
    public int countSubarrays(int[] nums) {
        int i = 0, j = 0, k = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        while (j < nums.length) {
            int winSize = j - i + 1;
            arr.add(nums[j]);
            if (winSize < k) {
                j++;
            } else if (winSize == k) {
                if (checkCondition(arr)) {
                    count++;
                }
                arr.remove(0);
                i++;
                j++;
            }
        }
        return count;
    }

    public static boolean checkCondition(List<Integer> arr) {
        if (arr.size() != 3) {
            return false; 
        }
        int first = arr.get(0);
        int second = arr.get(1);
        int third = arr.get(2);
        return (second % 2 == 0) && ((first + third) == (second / 2));
    }
}