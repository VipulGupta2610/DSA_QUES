package pkg;

public class kadaneAlgo {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
maxSubArray(nums);
    }

    static void maxSubArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < n; j++) {
                for (int j2 = i; j2 <=j; j2++) {
                    System.out.print(nums[j2]);
                }
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
