package pkg;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        setZeroes(matrix);
    }

// accepted

    static void setZeroes(int[][] matrix) {

        boolean[][] mat = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (matrix[i][j] != 0) {
                    mat[i][j] = true;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == false) {
                    int row = i;
                    int col = j;

                    while (row >= 0) {
                        matrix[row][col] = 0;
                        row--;
                    }
                    row = i;
                    while (col >= 0) {
                        matrix[row][col] = 0;
                        col--;
                    }
                    col = j;
                    while (row < mat.length) {
                        matrix[row][col] = 0;
                        row++;
                    }
                    row = i;
                    while (col < mat[0].length) {
                        matrix[row][col] = 0;
                        col++;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(mat));
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

}