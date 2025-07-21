class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        for (char i : s.toCharArray()) {
            int len = res.length();
            if (len >= 2 && res.charAt(len - 1) == i && res.charAt(len - 2) == i) {
                continue;
            }
            res.append(i);
        }
        return res.toString();
    }
}