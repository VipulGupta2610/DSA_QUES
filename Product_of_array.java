package pkg;

import java.util.Arrays;

public class Product_of_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] productExceptSelf(int[] nums) {
        int [] anss = new int[nums.length];
        int totalPrd=1;
        for (int i = 0; i < anss.length; i++) {
            totalPrd*=nums[i];
        }
        for (int i = 0; i < anss.length; i++) {
            int ans = totalPrd/nums[i];
            anss[i]=ans;
        }
        return anss;
    }
}
