class Solution {
    public int maxScore(String s) {
        int total1=0,count0=0,count1=0;
        int ans=0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                total1++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
            int current = count0 + (total1 - count1);
            ans = Math.max(ans, current);
        }
        return ans;
    }
}