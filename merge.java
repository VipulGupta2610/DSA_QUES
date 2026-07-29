package pkg;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merger(nums1, m, nums2, n);
    }

    static void merger(int[] nums1, int m, int[] nums2, int n) {
        System.out.println(Arrays.toString(nums1));
        int i = m - 1; // 0
        int j = n - 1; // 0
        int k = nums1.length - 1; // 1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k -= 1;
                i -= 1;
            } else if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                k -= 1;
                j -= 1;
            } else {
                nums1[k] = nums2[j];
                j -= 1;
                k -= 1;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}