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
        // while (min < max) {
        //     int mid = min + (max - min) / 2;
        //     if (isValid(mid, n, max, quantities)) {
        //         min = mid;
        //     } else {
        //         max = mid;
        //     }
        // }
        return max;
    }

    // static boolean isValid(int maxAllowed, int totalStores, int totalProducts, int[] array) {
    //     int i = 1;
    //     while (totalStores > 0) {
    //         for (int prodcuts : array) {
    //             int productsLeft = prodcuts;
    //             while (productsLeft>0) {
    //                 if (productsLeft-maxAllowed >=0){
    //                     productsLeft-=maxAllowed;
    //                 }else{

    //                 }
    //             }
    //         }
    //     }
    // }

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
