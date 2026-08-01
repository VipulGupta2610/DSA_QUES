package pkg;

public class Rotated_array {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int ans = search(arr, 0);
        System.out.println(arr[ans]);
    }

    static int search(int[] nums, int target) {
        int peak = peakIndex(nums);
        int idx = -1;
        if (nums[peak] == target) {
            return peak;
        } else if (target > nums[0]) {
            idx = findIdxOfTrgt(nums, target, 0, peak);
        } else {
            idx = findIdxOfTrgt(nums, target, peak + 1, nums.length - 1);
        }
        return idx;
    }

    static int findIdxOfTrgt(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (target < nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int peakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[0] > nums[nums.length - 1]) {
                if (nums[mid] > nums[mid + 1]) {
                    return mid;
                }
                if (nums[mid] < nums[mid + 1]) {
                    end = mid - 1;
                }
            } else {
                return end;
            }
        }
        return -1;
    }
}