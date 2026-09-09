class Solution {

    Set<Integer> visited = new HashSet<>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        dfs(rooms,0);
        if (visited.size() == rooms.size()) {
            return true;
        }
        return false;
    }

    public void dfs(List<List<Integer>> rooms,int curr){
        visited.add(curr);
        for(int r: rooms.get(curr)){
            if(!visited.contains(r)){
                dfs(rooms,r);
            }
        }
    }
    // set array [-1,-1,-1,-1,1]
    // queeye <1,2,3>

}