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
        int [] anss = new int[nums.length];
        int totalPrd = 1;
        int final_prd = 1;
        for (int i = 0; i < anss.length; i++) {
            totalPrd*=nums[i];
            if (nums[i]==0){
                continue;
            }
            final_prd*=nums[i];
        }
        for (int i = 0; i < anss.length; i++) {
            if (nums[i]==0){
                anss[i]=final_prd;
                continue;
            }
            int ans = totalPrd/nums[i];
            anss[i]=ans;
        }
        return anss;
    }
}
