package pkg;

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int [][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {
        boolean[][]mat = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (matrix[i][j]!=0){
                    mat[i][j]=true;
                }   
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

}