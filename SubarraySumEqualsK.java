package pkg;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subarraySum(arr, 3));
    }

    static int subarraySum(int[] nums, int k) {
        int totalSubArr = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == k) {
                totalSubArr += 1;
                System.out.println(nums[mid]);
            } 
            if (k<nums[mid]){
                end = mid-1;
            }else if (k>nums[mid]){
                start = mid+1;
            }else{
                mid++;
            }
        }
        return totalSubArr;
    }

    // static int subarraySum(int[] nums, int k) {
    // int totalSub = 0;
    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // for (int j = i; j < nums.length; j++) {
    // if (sum+nums[j]==k){
    // totalSub+=1;
    // }
    // sum+=nums[j];
    // }
    // }
    // return totalSub;
    // }

}