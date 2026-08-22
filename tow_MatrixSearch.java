package pkg;

public class tow_MatrixSearch {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 } };
        int target = 13;
        System.out.println(matrix[0].length - 1);
        boolean isThere = searchMatrix(matrix, target);
        System.out.println(isThere);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cStart = 0;
        int cEnd = matrix[0].length - 1;
        while (rStart <= rEnd) {
            int midRow = rStart + (rEnd - rStart) / 2;
            if (target >= matrix[midRow][cStart] && target <= matrix[midRow][cEnd]) {
                return simpleBinarySearch(matrix, target, midRow, cStart, cEnd);
            } else if (target > matrix[midRow][cEnd]) {
                rStart = midRow+1;
            } else {
                rEnd = midRow-1;
            }
        }
        return false;
    }

    static boolean simpleBinarySearch(int[][] matrix, int target, int row, int start, int end) {
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target==matrix[row][mid]){
                return true;
            }
            else if (target>matrix[row][mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }}
    // static boolean searchMatrix(int[][] matrix, int target) {
    // int divider = matrix.length;
    // int row = 0;
    // int maxRow = matrix.length - 1;
    // int column = 0;
    // int maxColumn = matrix[0].length - 1;
    // while (row <= maxRow && column <= maxColumn && row>=0 && column>=0) {
    // int midRow = row + (maxRow - row) / 2;
    // int midCol = column + (maxColumn - column) / 2;
    // System.out.println("Mid row : "+midRow);
    // System.out.println("Mid col : "+midCol);
    // if (matrix[midRow][midCol] == target) {
    // return true;
    // }
    // if (target < matrix[midRow][maxColumn]) {
    // maxRow = midRow;
    // maxColumn = midCol;
    // } else {
    // row=midRow;
    // column=midCol;
    // }
    // }
    // return false;
    // }

    // static boolean searchMatrix(int[][] matrix, int target) {
    // int[] duplicate = new int[matrix.length * (matrix[0].length)];
    // // creating duplicate array is not allowed but it was working fine
    // // int d_idx = 0;
    // // for (int i = 0; i < matrix.length; i++) {
    // // for (int j = 0; j < matrix[i].length; j++) {
    // // duplicate[d_idx] = matrix[i][j];
    // // d_idx++;
    // // }
    // // }
    // int start = 0;
    // int end = duplicate.length - 1;
    // while (start < end) {
    // int mid = start + (end - start) / 2;
    // if (duplicate[mid] == target) {
    // return true;
    // } else if (target > duplicate[mid]) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return false;
    // }
