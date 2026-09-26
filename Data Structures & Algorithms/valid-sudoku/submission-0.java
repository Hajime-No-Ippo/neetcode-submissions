class Solution {

    Set<Character> set = new HashSet<>();
    Set<Character> setX = new HashSet<>();
    Set<Character> setY = new HashSet<>();
    public boolean isValidSudoku(char[][] board) {
        //Vertically & Horizontally
        int i = 0, j = 0;
        while(i < 9) {
            j = 0;
            setX.clear();
            setY.clear();
            while(j < 9) {
                if(board[i][j] != '.') {
                    if (!checkUnique(setX, board[i][j])){
                        return false;
                    }
                }
                if(board[j][i] != '.') {
                    if (!checkUnique(setY, board[j][i])){
                        return false;
                    }
                }
                j++;
            }
            i++;
        }

        // Sub-Matrix
        i = 0;
        j = 0;

        for(; i < 9; i += 3) {
            j = 0;
            for(; j < 9; j += 3) {
                set.clear();
                if(!checkSub_Matrix(board, i,j)) {
                    return false;
                } 
            }
        }
        // 0,0 0,3 0,6 3,0 3,3 3,6
        return true;
    }

    // Checking Method
    public boolean checkUnique(Set<Character> set, char val) {
        return set.add(val);
    }

    public boolean checkSub_Matrix(char[][] board, int i,  int j) {
        int boundX = i + 3, boundY = j + 3, startJ = j;
        for(;i < boundX; i++) {
            for(j = startJ; j < boundY; j++) {
                if(board[i][j] == '.') continue;
                if (!checkUnique(set, board[i][j])) {
                    return false;   
                }
            }
        }
        return true;
    }
}
