import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {
    public static void main(String[] args) {
        int [] arr = {1,0,-1,0,-2,2};
         List<List<Integer>> ans = fourSum(arr, 0);
         System.out.println(ans);
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> inner = new ArrayList<>();
                int second = nums[j];
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = first + second + l + r;
                    if (sum == target) {
                        inner.add(first);
                        inner.add(second);
                        inner.add(l);
                        inner.add(r);
                    } else if (sum < target) {
                        l++;
                    }
                    else if (sum > target){
                        r--;
                    }
                }

            }
        }
        return list;
    }
}
