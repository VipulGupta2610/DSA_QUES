package pkg;

import java.util.ArrayList;

public class Three_sum {
    public static void main(String[] args) {

    }

    static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            for (j = 0; j < nums.length; j++) {
                if (i == j){
                    continue;
                }
                int j2 = 0;
                for (j2 = 0; j2 < nums.length; j2++) {
                    if (i == j && j  == j2){
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0){
                        list.add(null)
                    }
                }
            }
        }
    }
}
