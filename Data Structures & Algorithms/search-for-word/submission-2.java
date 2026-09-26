class Solution {

    public int[][] dirs = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (backtrack(board, word, i, j, 0, dirs)) return true;
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, int i, int j, int cnt, int[][] dirs) {
        // base case
        if(cnt == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
            return false;
        }
        if (board[i][j] != word.charAt(cnt)) return false;
        if(board[i][j] == '#') return false;
        
        char temp = board[i][j];
        board[i][j] = '#';
        boolean fnd = false;

        for(int[] d : dirs) {
            fnd = fnd || backtrack(board, word, i + d[0], j + d[1], cnt + 1, dirs );
            if (fnd) break;
        }

        board[i][j] = temp;
        return fnd;
    }
}
