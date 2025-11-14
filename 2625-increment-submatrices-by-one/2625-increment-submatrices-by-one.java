class Solution {
    int[][] mt;

    public int[][] rangeAddQueries(int n, int[][] queries) {
        mt = java.util.stream.IntStream.range(0, n).mapToObj(i -> new int[n]).toArray(int[][]::new);
        for(int[] que:queries){
            addOnes(que[0],que[1],que[2],que[3]);
        }
        return mt;
    }

    public void addOnes(int r1,int c1,int r2,int c2){
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                mt[i][j]=mt[i][j]+1;
            }
        }
    }

}