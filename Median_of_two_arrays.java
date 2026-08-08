package pkg;

import java.util.Arrays;

public class Median_of_two_arrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2};
        int[] nums2 = { 3,4 };
      double ans =   findMedianSortedArrays(nums1, nums2);
      System.out.println(ans);
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mIdx = 0;
        int nIdx = 0;
        int[] merged_array = new int[m + n];
        int k = 0;
        double median =0;
        while ( mIdx < m && nIdx < n) {
            if (nums1[mIdx] <= nums2[nIdx]) {
                merged_array[k] = nums1[mIdx];
                k++;
                mIdx++;
            } else if (nums2[nIdx] < nums1[mIdx]) {
                merged_array[k] = nums2[nIdx];
                k++;
                nIdx++;
            }
        }
        while (mIdx < m) {
            merged_array[k] = nums1[mIdx];
            k++;
            mIdx++;
        }
        while (nIdx < n) {
            merged_array[k] = nums2[nIdx];
            k++;
            nIdx++;
        }
        System.out.println(Arrays.toString(merged_array));
        if (merged_array.length%2 == 0){
            int mid = merged_array.length/2;
            median = (merged_array[mid] + merged_array[mid+1])/2;
            return median;
        }
        else{
            int mid = merged_array.length/2;
            return merged_array[mid];
        }
    }
}