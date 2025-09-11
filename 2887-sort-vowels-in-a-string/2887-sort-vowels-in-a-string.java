class Solution {
    public String sortVowels(String s) {
        char[] strArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        // Lowercase vowels
        map.put('a', (int) 'a');
        map.put('e', (int) 'e');
        map.put('i', (int) 'i');
        map.put('o', (int) 'o');
        map.put('u', (int) 'u');

        // Uppercase vowels
        map.put('A', (int) 'A');
        map.put('E', (int) 'E');
        map.put('I', (int) 'I');
        map.put('O', (int) 'O');
        map.put('U', (int) 'U');
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(strArr[i])) {
                vowels.append(strArr[i]);
                strArr[i] = '-'; // mark placeholder
            }
        }

        List<Character> chars = new ArrayList<>();
        for (char c : vowels.toString().toCharArray()) {
            chars.add(c);
        }
        chars.sort((c1, c2) -> map.get(c1) - map.get(c2));
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (strArr[i] == '-') {
                strArr[i] = chars.get(j);
                j++;
            }
        }
        return new String(strArr);
    }
}