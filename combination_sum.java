package pkg;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static void main(String[] args) {

    }

    // recurssion will be used here
    static List<List<Integer>> combinationSum(int[] candidates, int target) {

    }

    static List<Integer> helper(int[] arr, int target, int num, List<Integer> list) {
        if (sum(list, num) > target) {
            return new ArrayList<>();
        }
        
    }

    static int sum(List<Integer> list, int num) {
        int ans = num;
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i);
        }
        return ans;
    }

    // static void comSum(int num, int currentSum, int target, int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // List<Integer> list = new ArrayList<>();
    // while (helper(num, currentSum, target)) {
    // currentSum+=num;
    // list.add(num);
    // }
    // }
    // }

    // static boolean helper(int num, int currentSum, int target) {
    // if (num + currentSum > target) {
    // return false;
    // }
    // return true;
    // }

}
