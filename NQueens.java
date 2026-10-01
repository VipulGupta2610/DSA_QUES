package pkg;

import java.util.List;

public class NQueens {
    public static void main(String[] args) {

    }

    static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> list = nqueen(board, 0);
        return list;
    }

    static List<List<String>> nqueen(boolean[][]board,int r){
        if (r>=board.length){
            
        }
        for (int c = 0; c<board.length;c++){
            if (isSafe(board, r, c)){
                board[r][c]=true;
                nqueen(board, r+1);
                board[r][c]=false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        if (board[r][c]) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[r][i]) {
                return false;
            }
        }
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[r - i][c - i]) {
                return false;
            }
        }
        int maxRight = Math.min(r, board.length - 1 - c);
        for (int i = 1; i <= maxRight; i++) {
            if (board[r - i][c + i]) {
                return false;
            }
        }
        return true;
    }
}
