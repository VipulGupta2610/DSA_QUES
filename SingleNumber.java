package pkg;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        finder(nums);
    }
    static int finder(int [] nums){
        int count = 0;
        int idx = 0;
        for (int num : nums){
            count =0;
            for (int i = 0; i < nums.length; i++) {
                System.out.println("At i:"+i);
                idx = i;
                if (nums[i] == num){
                    count+=1;
                }
                if (count == 2){
                    break;
                }
            }
            System.out.println("At index:"+idx);
              if (count == 1){
                System.out.println(nums[idx]);
                System.out.println(count);
                    return nums[idx];
                }
        }
        return -1;
    }
}
