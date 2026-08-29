package pkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Three_sum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j < nums.length; j++) {
                set.add(nums[j]);
            }

            for (int j = 0; j < nums.length; j++) {
                int toFind = -(nums[i]+nums[j]);
                set.remove(nums[j]);
                set.remove(nums[i]);

                if (set.contains(toFind)){
                 ArrayList<Integer> triplet = new ArrayList<>();
                 triplet.add(nums[i]);
                 triplet.add(nums[j]);
                 triplet.add(toFind);
                 if (list.contains(triplet)){
                    continue;
                 }
                 list.add(triplet);
                 continue;
                }
                
            }
        }
        return list;
    }
}















































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
