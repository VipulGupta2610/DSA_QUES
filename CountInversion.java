package pkg;

import java.util.List;

public class CountInversion {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 1, 3, 5);
        long ans = countInversions(list);
        System.out.println(ans);
    }

    static long countInversions(List<Integer> arr) {
        int[] nums = arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return mergeSort(nums, 0, nums.length - 1);
    }

    static long mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = start + (end - start) / 2;

        long leftCount = mergeSort(arr, start, mid);
        long rightCount = mergeSort(arr, mid + 1, end);
        long mergeCount = merge(arr, start, mid, end);

        return leftCount + rightCount + mergeCount;
    }

    static long merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;
        long count = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += n1 - i;
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }

        return count;
    }

    // brute force
    // static int countInversions(int[] nums) {
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    // long first = nums[i];
    // for (int j = i + 1; j < nums.length; j++) {
    // long second = nums[j];
    // if (first > second) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

}
