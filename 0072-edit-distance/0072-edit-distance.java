class Solution {
    public int minDistance(String word1, String word2) {
        int w2Len = word2.length();
        int w1Len = word1.length();

        int[][] mt = new int[w1Len + 1][w2Len + 1];

        for (int i = 0; i <= w1Len; i++) {
            mt[i][0] = i;
        }
        for (int j = 0; j <= w2Len; j++) {
            mt[0][j] = j;
        }

        for (int i = 1; i <= w1Len; i++) {
            for (int j = 1; j <= w2Len; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    mt[i][j] = mt[i - 1][j - 1];
                } else {

                    mt[i][j] = 1 + Math.min(mt[i - 1][j - 1], Math.min(mt[i - 1][j], mt[i][j - 1]));
                }
            }
        }
        return mt[w1Len][w2Len];
    }
}