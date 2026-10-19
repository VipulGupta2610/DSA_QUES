package pkg;

import java.util.List;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int ans = countInversions(arr);
        System.out.println(ans);
    }

    static int countInversions(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            long first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                long second = nums[j];
                if (first > (2 * second)) {
                    count++;
                }
            }
        }
        return count;
    }

}
