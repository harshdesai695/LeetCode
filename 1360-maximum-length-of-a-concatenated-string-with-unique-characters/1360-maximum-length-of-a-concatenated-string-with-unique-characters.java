class Solution {
    public int maxLength(List<String> arr) {

        int i = 0;
        StringBuilder str = new StringBuilder();
        return calculateMax(i, arr.size(), arr, str);
    }

    public int calculateMax(int i, int n, List<String> arr, StringBuilder str) {
        if (i >= n) {
            return str.length();
        }
        int include = 0;
        int exclude = 0;
        exclude = calculateMax(i + 1, n, arr, str);
        if (hasUnique(arr.get(i))&&!hasduplicate(arr.get(i), str.toString())) {
            StringBuilder newStr = new StringBuilder(str);
            newStr.append(arr.get(i));
            include = calculateMax(i + 1, n, arr, newStr);
        }
        return Math.max(include, exclude);
    }

    public boolean hasduplicate(String old, String newStr) {
        HashSet<Character> set = new HashSet<>();

        for (char c : old.toCharArray()) {
            set.add(c);
        }
        for (char c : newStr.toCharArray()) {
            if (set.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}