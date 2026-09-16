package pkg;

public class kadaneAlgo {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
maxSubArray(nums);
    }

    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentSum=0;
            for (int j = i; j < n; j++) {
               currentSum+=nums[j];
               if (currentSum>maxSum){
                maxSum=currentSum;
               }
            }
            
        }
        return maxSum;
    }
}
