package pkg;

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 3, 4, 5 };
        int max = maxSubArray(nums);
        System.out.println(max);
    }

    static int maxSubArray(int[] nums) {
       int n = nums.length;
       int maxSum = Integer.MIN_VALUE;
       int currentSum = 0;
       for (int i = 0; i < n; i++) {
            currentSum+=nums[i];
            if (currentSum>maxSum){
                maxSum=currentSum;
            }
            if (currentSum<0){
                currentSum=0;
            }
       }
       return maxSum;
    }
}
