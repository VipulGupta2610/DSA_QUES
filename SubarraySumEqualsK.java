package pkg;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int k = 2;
        int ans = subarraySum(arr, k);
        System.out.println(ans);
    }

    static int subarraySum(int[] nums, int k) {
        int totalSubSet = 0;
        int currSum;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                totalSubSet += 1;
                continue;
            }
            for (int j = 0; j < nums.length; j++) {
                if (currSum + nums[i] == k) {
                    totalSubSet += 1;
                    break;
                }
                if (currSum + nums[i] > k) {
                    break;
                }
                if (currSum + nums[i] < k) {
                    currSum += nums[i];
                }
            }
        }
        return totalSubSet;
    }

    // got rejection
    // static int subarraySum(int[] nums, int k) {
    // int totalSubSet = 0;
    // int currSum= 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (currSum+nums[i]==k || nums[i]==k){
    // totalSubSet+=1;
    // currSum=0;
    // }
    // currSum+=nums[i];

    // }
    // return totalSubSet;
    // }
}
