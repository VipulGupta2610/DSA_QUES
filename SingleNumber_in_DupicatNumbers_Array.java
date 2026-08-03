package pkg;

public class SingleNumber_in_DupicatNumbers_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int[] arr1 = { 1, 1, 2,2, 3, 3, 4, 8, 8 };
        int[] arr2 = { 1, 1, 2,2, 3, 3, 4, 4, 8 };
        int ans = singleNonDuplicate(arr);
        int ans1 = singleNonDuplicate(arr1);
        int ans2 = singleNonDuplicate(arr2);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

}
