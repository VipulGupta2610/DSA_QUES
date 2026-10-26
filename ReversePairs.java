package pkg;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 1 };
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