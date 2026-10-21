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
        if (start<end){
            int mid = start + (end - start )/2;
            int mg1 = mergeSort(arr, start, mid);
            int mg2 = mergeSort(arr, mid+1, end);
            int mrg = merge(arr,start,mid,end);
            count = mg1+mg2+mrg;
        }
        return count;
    }

    static int merge(int []arr , int start,int mid, int end){
        
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
