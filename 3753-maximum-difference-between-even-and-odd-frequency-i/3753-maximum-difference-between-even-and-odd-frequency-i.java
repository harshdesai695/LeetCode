class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        // System.out.println("map"+map);

        Set<Character> keys = map.keySet();
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;

        for(char i:keys){
            int val=map.get(i);
            if(val%2==0){
                minEven=Math.min(minEven,val);
            }else{
                maxOdd=Math.max(maxOdd,val);
            }
        }

        return maxOdd-minEven;
    }

}