class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n];

        queue.add(source);
        visited[source] = 1;

        while (!queue.isEmpty()) {
            int f = queue.peek();
            if (f == destination) {
                return true;
            }
            queue.poll();
            for (int i : adjList.get(f)) {
                if (visited[i] != 1) {
                    visited[i] = 1;
                    queue.add(i);
                }
            }
        }
        return false;
    }
}