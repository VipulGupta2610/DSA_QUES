import java.util.ArrayList;
import java.util.List;

public class four_sum {
    public static void main(String[] args) {

    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                List<Integer> inner = new ArrayList<>();
                int second = nums[j];
                int l = j+1;
                int r = nums.length-1;
                while (l<r) {
                    
                }
                
            }
        }
        return list;
    }
}
