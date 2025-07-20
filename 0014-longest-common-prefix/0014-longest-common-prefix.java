class Solution {

    private TrieNode root;

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        root = new TrieNode();
        for (String word : strs) {
            insert(word);
        }

        return getLongestCommonPrefix(strs[0]);
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
        int count = 0;
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
                node.count++; // count the number of non-null children
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    private String getLongestCommonPrefix(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.count == 1 && !node.isEndOfWord) {
                prefix.append(ch);
                node = node.children[index];
            } else {
                break;
            }
        }

        return prefix.toString();
    }
}