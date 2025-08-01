class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    innerList.add(1);
                } else {
                    innerList.add(outerList.get(i - 2).get(j - 2) + outerList.get(i - 2).get(j - 1));
                }
            }
            outerList.add(innerList);
        }

        return outerList;
    }
}