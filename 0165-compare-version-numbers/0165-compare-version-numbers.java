class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int maxLength = Math.max(v1.length, v2.length);
        v1 = Arrays.copyOf(v1, maxLength);
        v2 = Arrays.copyOf(v2, maxLength);
        for (int i = 0; i < maxLength; i++) {
            if (v1[i] == null)
                v1[i] = "0";
            if (v2[i] == null)
                v2[i] = "0";

            int num1 = Integer.parseInt(v1[i]);
            int num2 = Integer.parseInt(v2[i]);

            if (num1 < num2)
                return -1;
            if (num1 > num2)
                return 1;
        }
        return 0;
    }
}