package pkg;

import java.util.ArrayList;

public class Three_sum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
ArrayList<ArrayList<Integer>> ans = threeSum(arr);
System.out.println(ans);
    }

    static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            for (j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int j2 = 0;
                for (j2 = 0; j2 < nums.length; j2++) {
                    if (i == j || i == j2 || j == j2) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[j2] == 0) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[j2]);
                        list.add(triplet);
                    }
                }
            }
        }
        return list;
    }
}
