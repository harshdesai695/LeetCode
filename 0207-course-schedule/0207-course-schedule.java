class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if (numCourses <= 0) {
            return true;
        }

        //Creatin graph from data
        int[] degree = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int parent = edge[1];
            int child = edge[0];
            graph.get(parent).add(child);
            degree[child]++;
        }

        //BFS
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;

            for (int i : graph.get(course)) {
                degree[i]--;
                if (degree[i] == 0) {
                    queue.add(i);
                }
            }
        }

        return count==numCourses;
    }
}