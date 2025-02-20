// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

class Sudoku {
    public void solveSudoku(char[][] board) {
        sudokuSolver(0,0,board);
    }

    public boolean isValidPosition(int row, int col, char[][] board, char ch) {
        // column wise check
        // column fixed
        for(int r = 0; r<9; r++) {
            if(board[r][col] == ch) {
                return false;
            }
        }

        // row wise check
        // row fixed
        for(int c = 0; c<9; c++) {
            if(board[row][c] == ch) {
                return false;
            }
        }

        // square box checking
        int startingRow = (row/3)*3;
        int startingCol = (col/3)*3;
        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                if(board[startingRow+r][startingCol+c] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean sudokuSolver(int row, int col, char[][] board) {

        if(row == 9) {
            // we get a valid answer
            //Print
            return true;
        }

        // all columns are filled for that particular row
        if(col == 9) {
           return sudokuSolver(row+1, 0, board);
        }

        // ek valid row and col
        if(board[row][col] == '.') {
            for(char ch = '1'; ch <= '9'; ch++) {
                if(isValidPosition(row, col, board, ch)) {
                    board[row][col] = ch;
                    if(sudokuSolver(row, col+1, board)) {
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        } else {
            return sudokuSolver(row, col+1, board);
        }

        // No valid answer
        return false;
    }
}