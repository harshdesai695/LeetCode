class FindSumPairs {

    int[] arr1;
    int[] arr2;
    HashMap<Integer, Integer> map = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.arr1=nums1;
        this.arr2=nums2;
        for (int num : arr2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.print(map);
    }

    public void add(int index, int val) {
        int temp = arr2[index];
        map.put(temp, map.get(temp) - 1);
        if (map.get(temp) == 0) {
            map.remove(temp);
        }
        arr2[index] += val;
        map.put(arr2[index], map.getOrDefault(arr2[index], 0) + 1);
    }

    public int count(int tot) {
        int count = 0;

        for (int num1 : arr1) {
            int diff = tot - num1;
            count += map.getOrDefault(diff, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */