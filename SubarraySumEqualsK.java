package pkg;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int []arr= {1,1,1};
        int k = 3;
        int ans = subarraySum(arr, k);
        System.out.println(ans);
    }
    static int subarraySum(int[] nums, int k) {
        int totalSubSet = 0;
        int currSum= 0;
        for (int i = 0; i < nums.length; i++) {
            if (currSum+nums[i]==k){
                totalSubSet+=1;
                currSum=0;
            }else{
                currSum+=nums[i];
            }
        }
        return totalSubSet;
    }
}
