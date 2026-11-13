package pkg;

import java.util.List;

public class combination_sum {
    public static void main(String[] args) {

    }

    // recurssion will be used here
    static List<List<Integer>> combinationSum(int[] candidates, int target) {

    }

    static void comSum(int num, int currentSum, int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (helper(num, currentSum, target)) {
                currentSum+=num
            }
        }
    }

    static boolean helper(int num, int currentSum, int target) {
        if (num + currentSum > target) {
            return false;
        }
        return true;
    }

}
