package pkg;

import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        
    }
    static List<List<String>> solveNQueens(int n) {
        int[][]board = new int[n][n];
    }
    static boolean isSafe(boolean [][]board,int r , int c ){
        if (board[r][c]){
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[r][i]){
                return false;
            }
        }
        for (int i = 0; i < r; i++) {
            if (board[i][c]){
                return false;
            }
        }
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[r-i][c-i]){
                return false;
            }
        }
        int maxRight = Math.min(r,board.length-1-c);
        for (int i = 1; i <=maxRight; i++) {
            if (board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
