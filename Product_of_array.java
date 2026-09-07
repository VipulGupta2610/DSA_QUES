package pkg;

import java.util.Arrays;

public class Product_of_array {
    public static void main(String[] args) {
        // int [] arr = {-1,1,0,-3,3};
        int [] arr = {0,0};
        int [] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        int no_of_zeros=0;
        for(int num : nums){
            if (num==0){
                no_of_zeros++;
            }
        }
        if (no_of_zeros>1){
            return ans;
        }
    }
}
