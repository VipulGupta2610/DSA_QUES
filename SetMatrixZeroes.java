package pkg;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {

        boolean[][] mat = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (matrix[i][j] != 0) {
                    mat[i][j] = true;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == false) {
                    int row = i;
                    int col = j;

                    while (row>=0) {
                        matrix[row][col]=0;
                        row--;
                    }
                    row+=1;
                    while (row<mat.length){
                        matrix[row][col]=0;
                        row++;
                    }
                    row -=1;
                    while (col>=0) {
                        matrix[row][col]=0;
                        col--;
                    }
                    col+=1;
                    while (col<mat[0].length){
                        matrix[row][col]=0;
                        col++;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(mat));
        for (int [] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
    }

}