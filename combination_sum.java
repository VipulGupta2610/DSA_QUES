package pkg;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ans = combinationSum(arr, target);
        for (List<Integer> ans1: ans){
            System.out.println(ans1);
        }
        // System.out.println(ans)
    }

    // recurssion will be used here
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(list);
            return;
        }
        if (target < 0 || index == arr.length) {
            return;
        }
        list.add(arr[index]);
        helper(arr, target - arr[index], index, list, ans);
        list.remove(list.size() - 1);
        helper(arr, target, index + 1, list, ans);
    }

    // static List<Integer> helper(int[] arr, int target, int num, List<Integer>
    // list) {
    // if (sum(list, num) > target) {
    // return new ArrayList<>();
    // }
    // if (sum(list,num)==target){
    // list.add(num);
    // return list;
    // }
    // if (sum(list, num)<target){
    // list.add(num);
    // List<Integer> ansList = helper(arr, target, num, list);
    // list.remove(list.size()-1);
    // }
    // for (int i = 0; i < arr.length; i++) {
    // List<Integer> ansList = helper(arr, target, arr[i], list);
    // if (ansList.isEmpty()){

    // }
    // }
    // }

    // static int sum(List<Integer> list, int num) {
    // int ans = num;
    // for (int i = 0; i < list.size(); i++) {
    // ans += list.get(i);
    // }
    // return ans;
    // }

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
