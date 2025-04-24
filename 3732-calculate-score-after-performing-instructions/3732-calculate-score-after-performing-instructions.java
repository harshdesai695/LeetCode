class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int arrSize=values.length;
        long score=0;
        int i=0;
        Set<Integer> visited = new HashSet<>();
        while(i >= 0 && i<arrSize && !visited.contains(i)){
            visited.add(i);
            if(instructions[i].equals("add")){
                score=score+values[i];
                // System.out.println(i+"->"+score);
                i++;
            }else if(instructions[i].equals("jump")){
                i=i+values[i];
                // System.out.println(i);
            }
        }
        return score;
    }
}