package pkg;

public class MounatinArray {
    public static void main(String[] args) {
        int[] arr = { 0,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(arr[ans]);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < arr.length - 1 && mid > 0 && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            else if (mid < arr.length - 1 && arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        return end;
    }

}
