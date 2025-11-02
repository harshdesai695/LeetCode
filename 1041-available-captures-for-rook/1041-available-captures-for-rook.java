class Solution {
    int count = 0;

    public boolean check(char ch) {
        if (ch == 'B') {
            return true;
        } else if (ch == 'p') {
            count++;
            return true;
        }
        return false;
    }

    public int numRookCaptures(char[][] board) {
        int I = -1;
        int J = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    I = i;
                    J = j;
                    break;
                }
            }
        }

        for (int i = J + 1; i < 8; i++) {
            if (check(board[I][i])) {
                break;
            }
        }

        for (int i = J - 1; i >= 0; i--) {
            if (check(board[I][i])) {
                break;
            }
        }

        for (int i = I - 1; i >= 0; i--) {
            if (check(board[i][J])) {
                break;
            }
        }

        for (int i = I + 1; i < 8; i++) {
            if (check(board[i][J])) {
                break;
            }
        }

        return count;
    }
}