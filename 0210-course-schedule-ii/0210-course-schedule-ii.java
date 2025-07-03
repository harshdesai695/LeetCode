class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

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
        
        int count = 0;
        int[] ans=new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int course = queue.poll();
            ans[count]=course;
            count++;

            for (int i : graph.get(course)) {
                degree[i]--;
                if (degree[i] == 0) {
                    queue.add(i);
                }
            }
        }

        if (count != numCourses) {
            return new int[0];
        }    

        return ans; 

    }
}