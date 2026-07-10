class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for(int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();

            for(int i = 0; i < 9; i++){

                if(board[row][i] == '.') continue;

                if(seen.contains(board[row][i]))
                    return false;

                seen.add(board[row][i]);
            }
        }

        // Check columns
        for(int col = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();

            for(int i = 0; i < 9; i++){

                if(board[i][col] == '.') continue;

                if(seen.contains(board[i][col]))
                    return false;

                seen.add(board[i][col]);
            }
        }

        // Check 3x3 boxes
        for(int square = 0; square < 9; square++){

            Set<Character> seen = new HashSet<>();

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 3; j++){

                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;

                    if(board[row][col] == '.') continue;

                    if(seen.contains(board[row][col]))
                        return false;

                    seen.add(board[row][col]);
                }
            }
        }

        return true;
    }
}