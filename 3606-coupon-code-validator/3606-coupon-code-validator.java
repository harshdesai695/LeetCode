class Solution {
    HashSet<String> bl;
    String regex = "^[a-zA-Z0-9_]+$";

    Solution() {
        bl = new HashSet<>();
        bl.add("electronics");
        bl.add("grocery");
        bl.add("pharmacy");
        bl.add("restaurant");
    }

    public boolean checkCode(String code) {
        return code != null && code.matches(regex);
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Integer> idx = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i]
                    && bl.contains(businessLine[i])
                    && checkCode(code[i])) {
                idx.add(i);
            }
        }

        idx.sort(Comparator.comparing((Integer i) -> businessLine[i]).thenComparing(i -> code[i]));

        List<String> ans = new ArrayList<>();
        for (int i : idx) {
            ans.add(code[i]);
        }
        return ans;
    }
}