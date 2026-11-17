package pkg;

import java.util.ArrayList;
import java.util.List;

public class combination_sum_2 {
    public static void main(String[] args) {

    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {

    }

    static void helper(int[] arr, int target, List<List<Integer>> ans, List<Integer> list, int idx) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return ;
        }

        list.add(arr[idx]);
        helper(arr, target - arr[idx], ans, list, idx + 1);
        list.remove(list.size() - 1);
        helper(arr, target, ans, list, idx + 1);
    }
}
