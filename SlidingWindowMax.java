package pkg;

public class SlidingWindowMax {
    public static void main(String[] args) {
        
    }

    static int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans = new int[nums.length-k+1];
        for (int i = 0; i < ans.length-k; i++) {
            int max = nums[i];
            for (int j = i; j < i+k; j++) {
                
            }
        }
    }

}