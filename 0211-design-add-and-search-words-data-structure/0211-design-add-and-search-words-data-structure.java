class TriNode {
    boolean isWord;
    TriNode[] children;

    public TriNode() {
        isWord = false;
        children = new TriNode[26];
    }

}

class WordDictionary {
    TriNode root;

    public WordDictionary() {
        root = new TriNode();
    }

    public void addWord(String word) {
        TriNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TriNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        TriNode node = root;
        return dfs(node, word, 0);
    }

    private boolean dfs(TriNode node, String word, int index) {
        if (index == word.length()) {
            return node.isWord;
        }
        char ch = word.charAt(index);
        if (ch != '.') {
            int idx = ch - 'a';

            if (node.children[idx] == null) {
                return false;
            }

            return dfs(node.children[idx], word, index + 1);
        }
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                if (dfs(node.children[i], word, index + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */