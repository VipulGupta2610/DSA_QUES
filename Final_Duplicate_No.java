package pkg;

public class Final_Duplicate_No {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        int ans = findNo(arr);
        System.out.println(ans);
    }

    static int findNo(int[] arr) {
        int i =0;
        while (i<arr.length) {
            int correctIdx = arr[i]-1;
            if (arr[i]!=arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                return arr[j];
            }
        }
        return -1;
    }

}
