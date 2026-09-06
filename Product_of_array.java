package pkg;

import java.util.Arrays;

public class Product_of_array {
    public static void main(String[] args) {
        int [] arr = {-1,1,0,-3,3};
        int [] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] productExceptSelf(int[] nums) {
        int [] anss = new int[nums.length];
        int totalPrd=1;
        for (int i = 0; i < anss.length; i++) {
            if (nums[i]==0){
                continue;
            }
            totalPrd*=nums[i];
        }
        for (int i = 0; i < anss.length; i++) {
            if (nums[i]==0){
                anss[i]=0;
                continue;
            }
            int ans = totalPrd/nums[i];
            anss[i]=ans;
        }
        return anss;
    }
}
