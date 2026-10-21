package pkg;

import java.util.List;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int ans = countInversions(arr);
        System.out.println(ans);
    }

    static int countInversions(int[] nums) {
        int n = nums.length-1;
        return mergeSort(nums,0,n);
    }

    static int mergeSort(int []arr , int start , int end){
        int count=0;
        
        return count;
    }

    // brute force
    // static int countInversions(int[] nums) {
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         long first = nums[i];
    //         for (int j = i + 1; j < nums.length; j++) {
    //             long second = nums[j];
    //             if (first >  second) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

}
