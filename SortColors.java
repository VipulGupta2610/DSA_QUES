package pkg;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            int secNum = nums[nums.length-1-i];
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j]>nums[num]){
                    num = j;
                }
            }
            nums[nums.length-1-i] = nums[num];
            nums[num]=secNum;
        }
    }
}
