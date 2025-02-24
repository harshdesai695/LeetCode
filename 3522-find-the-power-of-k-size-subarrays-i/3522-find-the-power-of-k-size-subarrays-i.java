class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int[] result = new int[n - k + 1];
        ArrayList<Integer> temp = new ArrayList<>();
        while (j < n) {
            temp.add(nums[j]);
            int winSize = j - i + 1;
            if (winSize < k) {
                j++;
            } else if (winSize == k) {
                result[i] = checkCondition(temp);
                temp.remove(0);
                i++;
                j++;
            }
        }
        return result;
    }

    public static int checkCondition(ArrayList<Integer> nums) {
        System.out.print(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != nums.get(i - 1)+1) {
                return -1; 
            }
        }
        return nums.get(nums.size() - 1); 
    }
}