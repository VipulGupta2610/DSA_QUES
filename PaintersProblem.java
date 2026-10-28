package pkg;

public class PaintersProblem {
    public static void main(String[] args) {
        
    }

    static int minTime(int[]arr , int k){
        int start = sum(arr);
        int end = maxv(arr);

        int result=-1;
        
        while (start<=end) {
            int mid 
        }

    }

    static int maxv(int[]arr){
        int num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>num){
                num=arr[i];
            }
        }
        return num;
    }

    static int sum(int []arr){
        int sm = 0;
        for (int i = 0; i < arr.length; i++) {
            sm+=arr[i];
        }
        return sm;
    }

}
