class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n];
        queue.add(0);
        visited[0] = 1;

        while (!queue.isEmpty()) {
            int f = queue.peek();
            queue.poll();
            for (int i : rooms.get(f)) {
                if (visited[i] != 1) {
                    visited[i] = 1;
                    queue.add(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(visited[i]!=1){
                return false;
            }
        }
        return true;
    }
}