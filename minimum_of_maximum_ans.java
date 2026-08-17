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
        System.out.println(max);
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (isValid(mid, n, quantities)) {
                max = mid;
            } else {
                min = mid+1;
            }
        }
        return max;
    }

    static boolean isValid(int maxAllowed, int totalStores, int[] array) {
        int storesRequired = 0;
        for(int products:array){
            int stores = (products+maxAllowed-1)/maxAllowed;
            storesRequired+=stores;
            if (storesRequired>totalStores){
                return false;
            }
        }
        return true;
    }

    static int maxItem(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>num){
                num = arr[i];
            }
        }
        return num;
    }
}
