package pkg;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(subarraySum(arr, 3));
    }

    static int subarraySum(int[] nums, int k) {
        int totalSub = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (sum+nums[j]==k){
                    totalSub+=1;
                }
                sum+=nums[j];
            }
        }
        return totalSub;
    }

}