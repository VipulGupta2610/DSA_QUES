package pkg;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 1 };
        int ans = reversePairs(arr);
        System.out.println(ans);
    }

    static int reversePairs(int[] nums) {
        int n = nums.length - 1;
        return mergeSort(nums, 0, n);
    }

    static int mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = start + (end - start) / 2;

        int leftCount = mergeSort(arr, start, mid);
        int rightCount = mergeSort(arr, mid + 1, end);
        int mergeCount = merge(arr, start, mid, end);

        return leftCount + rightCount + mergeCount;
    }

    static int merge(int[] arr, int start, int mid, int end) {
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
        int count = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                if (left[i]>(2*right[j])){
                    count += n1 - i;
                }
                arr[k++] = right[j++];
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
    // static int reversePairs(int[] nums) {
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    // long first = nums[i];
    // for (int j = i+1; j < nums.length; j++) {
    // long second = nums[j];
    // if (first > (2*second)){
    // count++;
    // }
    // }
    // }
    // return count;
    // }
}