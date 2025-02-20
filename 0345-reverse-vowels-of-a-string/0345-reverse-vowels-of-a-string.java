class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int low=0;
        int high=s.length()-1;
        HashMap<Character,Integer> vowelMap = new HashMap<>();
        vowelMap.put('a', 1);
        vowelMap.put('e', 2);
        vowelMap.put('i', 3);
        vowelMap.put('o', 4);
        vowelMap.put('u', 5);
        vowelMap.put('A', 6);
        vowelMap.put('E', 7);
        vowelMap.put('I', 8);
        vowelMap.put('O', 9);
        vowelMap.put('U', 10);

        while(low<high){
            while(low<high && !vowelMap.containsKey(word[low])){
                low++;
            }
            while(low<high && !vowelMap.containsKey(word[high])){
                high--;
            }
            char temp = word[low];
            word[low] = word[high];
            word[high] = temp;
            low++;
            high--;
        }

        return new String(word);
    }
}