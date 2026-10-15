package pkg;

import java.util.Arrays;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int []nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int [] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans = new int[nums.length-k+1];
        for (int i = 0; i < ans.length-k; i++) {
            int max = nums[i];
            for (int j = i; j < i+k; j++) {
                if (nums[j]>max ){
                    max = nums[j];
                }
            }
            ans[i]=max;
        }
        return ans ;
    }

}