package pkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_sum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> threeSum(int[] nums) {

        ArrayList<Integer> sortedarray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            sortedarray.add(nums[i]);
        }

        int n = nums.length-1;

        HashSet<List<Integer>> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = n;
            while (j<k) {
                if (j>0 && sortedarray.get(j)==sortedarray.get(j-1)){
                    continue;
                }
                
            }
        }   
    }
}





















// static List<List<Integer>> threeSum(int[] nums) {
//     List<List<Integer>> list = new ArrayList<>();
//     for (int i = 0; i < nums.length; i++) {

//         int target = -nums[i];

//         HashSet<Integer> set = new HashSet<>();

//         for (int j = i+1; j < nums.length; j++) {

//             int third = target-nums[j];
            
//             if (set.contains(third)){
//                 ArrayList<Integer> triplet = new ArrayList<>();
//                 triplet.add(nums[i]);
//                 triplet.add(nums[j]);
//                 triplet.add(third);
//                 triplet.sort(null);
//                 if (!list.contains(triplet)){
//                     list.add(triplet);
//                 }
//             }
//             set.add(nums[j]);
//         }
//     }
//     return list;
// }


























// static List<List<Integer>> threeSum(int[] nums) {
//     List<List<Integer>> list = new ArrayList<>();

//     for(
//     int i = 0;i<nums.length;i++)
//     {

//         for (int j = i + 1; j < nums.length; j++) {

//             for (int j2 = j + 1; j2 < nums.length; j2++) {

//                 if (nums[i] + nums[j] + nums[j2] == 0) {
//                     ArrayList<Integer> triplet = new ArrayList<>();
//                     triplet.add(nums[i]);
//                     triplet.add(nums[j]);
//                     triplet.add(nums[j2]);
//                     triplet.sort(null);
//                     if (list.contains(triplet)) {
//                         continue;
//                     }
//                     list.add(triplet);
//                 }
//             }
//         }
//     }return list;
// }
// static List<List<Integer>> threeSum(int[] nums) {
// List<List<Integer>> list = new ArrayList<>();

// for (int i = 0; i < nums.length; i++) {
// int j = 0;
// for (j = 0; j < nums.length; j++) {
// if (i == j) {
// continue;
// }
// int j2 = 0;
// for (j2 = 0; j2 < nums.length; j2++) {
// if (i == j || i == j2 || j == j2) {
// continue;
// }
// if (nums[i] + nums[j] + nums[j2] == 0) {
// ArrayList<Integer> triplet = new ArrayList<>();
// triplet.add(nums[i]);
// triplet.add(nums[j]);
// triplet.add(nums[j2]);
// list.add(triplet);
// }
// }
// }
// }
// return list;
// }
