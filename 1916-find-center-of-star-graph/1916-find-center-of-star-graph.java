class Solution {

    List<List<Integer>> adjList;

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        // If undirected graph, uncomment the next line:
        adjList.get(v).add(u);
    }

    public int findCenter(int[][] edges) {
        int maxNode = 0;
        for (int[] edge : edges) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }

        adjList = new ArrayList<>();
        for (int i = 0; i <=maxNode; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            addEdge(edge[0], edge[1]);
        }
        int len = maxNode;
        for (int i = 0; i < adjList.size(); i++) {
            if (adjList.get(i).size() == len - 1) {
                return i;
            }
        }
        return -1;
    }
}