package pkg;

public class tow_MatrixSearch {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 } };
        int target = 13;
        boolean isThere = searchMatrix(matrix, target);
        System.out.println(isThere);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int[] duplicate = new int[matrix.length * (matrix[0].length)];
        // creating duplicate array is not allowed but it was working fine 
        // int d_idx = 0;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         duplicate[d_idx] = matrix[i][j];
        //         d_idx++;
        //     }
        // }
        int start = 0;
        int end = duplicate.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (duplicate[mid] == target) {
                return true;
            } else if (target > duplicate[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}