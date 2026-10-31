package pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    // optimised
    static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int arrIdx = 0;
        // ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = i+k;
        int prevLargest = nums[i];
        while (j<nums.length-k) {
            int currentIdx = i;
            if (nums[currentIdx]>prevLargest){
                prevLargest=nums[currentIdx];
            }
            ans[arrIdx]=prevLargest;
            arrIdx++;
        }
        // Ine []ans = list.toArray(Integer[]::new);
        return ans;
    }


    // brute force 
    // static int[] maxSlidingWindow(int[] nums, int k) {
    //     int[] ans = new int[nums.length - k + 1];

    //     for (int i = 0; i <= nums.length - k; i++) {
    //         int max = Integer.MIN_VALUE;
    //         for (int j = i; j < i + k; j++) {
    //             if (nums[j] > max) {
    //                 max = Math.max(max, nums[j]);
    //             }
    //         }
    //         ans[i] = max;
    //     }
    //     return ans;
    // }
}