class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int r, int c, int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) {
            return false;
        }
        if (board[r][c] != word.charAt(idx)) {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '#';

        boolean found = dfs(board, word, r + 1, c, idx + 1) || dfs(board, word, r - 1, c, idx + 1)
                || dfs(board, word, r, c + 1, idx + 1) || dfs(board, word, r, c - 1, idx + 1);

        board[r][c] = temp;
        return found;
    }
}