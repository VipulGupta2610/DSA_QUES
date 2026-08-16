package pkg;

public class minimum_of_maximum_ans {
    public static void main(String[] args) {
        int[] arr = { 11, 6 };
        int n = 6;
        int ans = minimizedMaximum(n, arr);
    }

    static int minimizedMaximum(int n, int[] quantities) {
        int min = 0;
        int max = maxItem(quantities);
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (isValid(mid)) {
                min = mid;
            } else {
                max = mid;
            }
        }
        return max;
    }

    static boolean isValid(int mid) {
        
    }

    static int maxItem(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        return num;
    }
}
