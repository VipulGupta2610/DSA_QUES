package pkg;

import java.util.Arrays;


public class Median_of_two_arrays {
    public static void main(String[] args) {
        int [] nusm1 = {1,2,5,4};
        int [] nums2 = {3,6,7};
        double ans = findMedianSortedArrays(nums2, nums2);
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // index out of bound error
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int n1idx = m - 1;
        int n2idx = n - 1;
        for (int i = merged.length - 1; i >= 0; i--) {
            if (nums1[n1idx] > nums2[n2idx]) {
                merged[i] = nums1[n1idx];
                n1idx -= 1;
            }
            else {
                merged[i] = nums2[n2idx];
                n2idx--;
            }
        }
        System.out.println(Arrays.toString(merged));
        return 0.0;
    }
}