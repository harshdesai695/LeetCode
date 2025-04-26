class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            int[] indexArr = stringToIndexArray(str);
            String key = Arrays.toString(indexArr);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(key,newList);
            }
        }
        ans.addAll(map.values());
        return ans;
    }

    public static int[] stringToIndexArray(String str) {
        if (str == null) {
            return null;
        }
        int[] indexArray = new int[26];
        for (char ch : str.toCharArray()) { 
            if (ch >= 'a' && ch <= 'z') {
                indexArray[ch - 'a']++; 
            }
        }
        return indexArray;
    }
}