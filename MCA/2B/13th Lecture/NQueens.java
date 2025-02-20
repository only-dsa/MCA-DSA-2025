// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I

class NQueens {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(int r = 0; r<n; r++) {
            for(int c = 0; c<n; c++) {
                chessboard[r][c] = '.';
            }
        }
        backTracking(0, chessboard, n);

        return ans;
    }

    public boolean isValidPosition(int row, int col, char[][] board, int n) {
        int tempRow = row;
        int tempCol = col;
        // top left diagonal
        while(row >= 0 && col >= 0) {
            if(board[row][col] == 'Q') {
                return false;
            }

            row--;
            col--;
        }

        row = tempRow;
        col = tempCol;

        // bottom left diagonal
        while(row < n && col >= 0) {
            if(board[row][col] == 'Q') {
                return false;
            }

            row++;
            col--;
        }

         row = tempRow;
        col = tempCol;

        // left side
        while(col >= 0) {
            if(board[row][col] == 'Q') {
                return false;
            }

            col--;
        }

        return true;
    }

    public void backTracking(int col, char[][] board, int n) {
        if(col == n) {
            // valid answer
            List<String> list = new ArrayList<>();
            for(int r = 0; r < n; r++) {
                String s = "";
                for(int c = 0; c < n; c++) {
                    s+=board[r][c];
                }
                list.add(s);
            }

            ans.add(list);
            return;
        }

        for(int row = 0; row < n; row++) {
            if(isValidPosition(row, col, board, n)) {
                board[row][col] = 'Q';
                backTracking(col+1, board, n);
                board[row][col] = '.';
            }
        }
    }
}