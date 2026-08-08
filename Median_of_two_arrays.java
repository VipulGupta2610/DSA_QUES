package pkg;

import java.util.Arrays;


public class Median_of_two_arrays {
    public static void main(String[] args) {
        int [] nusm1 = {1,2,5,4};
        int [] nums2 = {3,6,7};
        double ans = findMedianSortedArrays(nums2, nums2);
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mIdx = 0;
        int nIdx = 0;
        int [] merged_array = new int[m+n];
        int k = 0;
        while (k<merged_array.length && mIdx < m && nIdx < n) {
            if (nums1[mIdx] < nums2[nIdx]){
                merged_array[k] =  nums1[mIdx];
                k++;
                mIdx++;
            }
            else if (nums2[nIdx] < nums1[mIdx]){
                merged_array[k] = nums2[nIdx];
                k++;
                nIdx++;
            }
        }
        while (mIdx<m) {
            
        }
    }
}