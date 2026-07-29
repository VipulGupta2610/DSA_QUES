// package pkg; 
// import java.util.Arrays;

// public class findMissingAndRepeatedValues {

//     public static void main(String[] args) {
//         int [][] grid  = {{1,4,5},{4,6,8},{7,3,2}};
//         int [] ans = nums(grid);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int [] nums (int [][] grid){
//         int cand = 0;
//         int count = 0;
//         int missingNum=-1;
//         outer:
//             for (int[] row : grid){
//                 for (int num:row){
//                     count = 0;
//                     cand = num;
//                     for (int i = 0; i < grid.length; i++) {
//                         for (int j = 0; j < grid.length; j++) {
//                             if (grid[i][j] == num){
//                                 count++;
//                             }
//                             if (count == 2){
//                                 break outer;
//                             }
//                         }
//                     }
//                 }

//             }
//         boolean isMiss = true;
//         outer:
//             for (int i = 1; i<=(grid.length)*(grid.length); i++){
//                 isMiss =  true;
//                 inner:
//                     for (int j = 0; j<grid.length; j++){
//                         for (int k =0 ; k<grid.length; k++){
//                             if (grid[j][k] == i){
//                                 isMiss = false;
//                                 break inner;
//                             }
//                         }
//                     }
//                 if (isMiss){
//                     missingNum =  i;
//                     break outer;
//                 }
//             }
//         return new int[]{cand , missingNum};
//     }
// }

package pkg;
import java.util.Arrays;;

public class findMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] grid = { { 1, 4, 5 }, { 4, 6, 8 }, { 7, 3, 2 } };
        int[] ans = nums(grid);
        System.out.println(Arrays.toString(ans));
    }

    static int[] nums(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n * n];
        int index = 0;
        for (int[] row : grid) {
            for (int num : row) {
                arr[index++] = num;
            }
        }

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] { arr[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
}