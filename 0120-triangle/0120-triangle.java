class Solution {

    Integer[][] mt;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        mt = new Integer[n][n];

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         mt[i][j] = -1;
        //     }
        // }

        return dp(triangle, 0, 0);
    }

    public int dp(List<List<Integer>> triangle, int i, int j) {

        // sum = sum + triangle.get(i).get(j);


        if (i == triangle.size() - 1) {
            return mt[i][j] = triangle.get(i).get(j);
        }

        
        if(mt[i][j]!=null){
            return mt[i][j];
        }    

        return mt[i][j] = triangle.get(i).get(j)+ Math.min(dp(triangle, i + 1, j), dp(triangle, i + 1, j + 1));

    }
}