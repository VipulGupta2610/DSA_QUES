package pkg;

public class ValidMountainArr {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0 };
        int IsMountain = validMountainArray(arr);
        System.out.println(IsMountain);
    }

    static int validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean mnArr;
        while (start < end) {
            mid = start + (end - start)/2;
            if (mid > 0 && mid < arr.length-1 && arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if (arr[mid]>arr[mid-1]){
                start = mid;
            }
            
        }
        return arr[start];
    }
}
