package pkg;

public class ValidMountainArr {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0 };
        boolean IsMountain = validMountainArray(arr);
        System.out.println(IsMountain);
    }

    static boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        boolean mnArr;
        while (start < end) {
            mid = start + (end - start)/2;
        }
        return start != 0 && end != arr.length - 1 && start == end;
    }
}
