class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        DFS(0, graph.length - 1, path, result, graph);
        return result;

    }

    public void DFS(int source, int target, List<Integer> path, List<List<Integer>> result, int[][] graph) {
        if (source == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i : graph[source]) {
            path.add(i);
            DFS(i, target, path, result, graph);
            path.remove(path.size() - 1);
        }

    }
}