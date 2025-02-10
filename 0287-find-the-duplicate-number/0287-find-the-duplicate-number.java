class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                return num;
            }
            else{
                map.put(num,num);
            }
        }
        return -1;
    }
}