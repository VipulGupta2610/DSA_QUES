package pkg;

import java.util.ArrayList;
import java.util.List;

public class combination_sum_2 {
    public static void main(String[] args) {
        int []arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(arr, target);
          for (List<Integer> ans1: ans){
            System.out.println(ans1);
        }
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
     helper(candidates, target, ans, new ArrayList<>(), 0);
     return ans ;
    }

    static void helper(int[] arr, int target, List<List<Integer>> ans, List<Integer> list, int idx) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return ;
        }
        if (idx == arr.length){
            return;
        }
        list.add(arr[idx]);
        helper(arr, target - arr[idx], ans, list, idx + 1);
        list.remove(list.size() - 1);
        helper(arr, target, ans, list, idx + 1);
    }
}
