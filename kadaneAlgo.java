package pkg;

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 3, 4, 5 };
        int max = maxSubArray(nums);
        System.out.println(max);
    }

    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
