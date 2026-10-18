package pkg;

public class ReversePairs {
    public static void main(String[] args) {
        int []arr = {1,3,2,3,1};
        int ans = reversePairs(arr);
        System.out.println(ans);
    }
    static  int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int second = nums[j];
                if (first > (2*second)){
                    count++;
                }
            }
        }
        return count;
    }
}