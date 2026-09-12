class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j]))   return false;
                set.add(board[i][j]);
            }
        }
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i]))   return false;
                set.add(board[j][i]);
            }
        }
        
        for(int boxRow = 0; boxRow < 3; boxRow++){
            for(int boxCol = 0; boxCol < 3; boxCol++){
                int start_row = boxRow*3;
                int end_row = start_row+3;
                int start_col = boxCol*3;
                int end_col = start_col+3;
                HashSet<Character> set = new HashSet<>();
                for(int i = start_row; i < end_row; i++){
                    for(int j = start_col; j < end_col; j++){
                        if(board[i][j] == '.') continue;
                        if(set.contains(board[i][j]))   return false;
                        set.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
