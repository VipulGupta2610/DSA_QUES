package pkg;

public class ReversePairs {
    public static void main(String[] args) {
        int []arr = {2,4,3,5,1};
        int ans = reversePairs(arr);
        System.out.println(ans);
    }

// brute force
    static  int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            long first = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                long second = nums[j];
                if (first > (2*second)){
                    count++;
                }
            }
        }
        return count;
    }
}