package pkg;

public class ValidMountainArr {
    public static void main(String[] args) {
        // int[] arr = { 0, 2, 1, 0};
        int[] arr = { 1, 2, 3, 4, 8, 9, 10 };
        boolean IsMountain = validMountainArray(arr);
        System.out.println(IsMountain);
    }

    static boolean validMountainArray(int[] arr) {

        int peak = findPeak(arr);
        System.out.println(arr[peak]);
        if (peak == 0 || peak == arr.length-1){
            return false;
        }
        return peak;

    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (mid > 0 && mid < arr.length - 1 && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] > arr[mid - 1]) {
                start = mid+1;
            }

        }
        return end;
    }
}
