class Solution {
    public char findKthBit(int n, int k) {
        String str = "0";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                sb.append(c == '0' ? '1' : '0');
            }
            sb.reverse();
            str = str + "1" + sb.toString();
        }

        return str.charAt(k - 1);
    }
}