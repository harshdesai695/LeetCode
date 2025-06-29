class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, 0, 0, n, "");
        return res;
    }

    public void generate(List<String> res, int o, int c, int n, String str) {
        if (o == n && c == n) {
            res.add(str);
            return;
        }

        if (o < n) {
            generate(res, o + 1, c, n, str + "(");
        }
        if (c < o) {
            generate(res, o, c + 1, n, str + ")");
        }

    }
}