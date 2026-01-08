class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        System.out.println(n1);
        System.out.println(n2);
        int[][] mt = new int[n1 + 1][n2 + 1];

        for (int i = 0; i <= n1; i++) {
            Arrays.fill(mt[i], Integer.MIN_VALUE / 2);
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                int pro = nums1[i - 1] * nums2[j - 1];
                int max = pro;
                int temp = pro + mt[i - 1][j - 1];
                // System.out.println("("+i+","+j+")->"+temp);
                if (temp > max) {
                    max = temp;
                }
                if (mt[i - 1][j] > max) {
                    max = mt[i - 1][j];
                }
                if (mt[i][j - 1] > max) {
                    max = mt[i][j - 1];
                }
                mt[i][j] = max;
            }
        }
        return mt[n1][n2];
    }

    // public int dotProduct(int[] n1,int[] n2){
    //     int sum=0;
    //     for(int i=0;i<n1.length;i++){
    //         sum=sum+(n1[i]*n2[i]);
    //     }
    //     return sum;
    // }
}