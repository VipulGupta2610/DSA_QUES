package pkg;

public class PaintersProblem {
    public static void main(String[] args) {
        
    }

    static int minTime(int[]arr , int k){
        int start = sum(arr);
        int end = maxv(arr);

        int result=-1;
        
        while (start<=end) {
            int mid = start+(end -start)/2;
            if (isValid(arr,k,mid)){
                result=mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return result;

    }

    static boolean isValid(int[]arr,int k,int maxTimeAllowed){
        int requiredPainters =1;
        int currentTime=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxTimeAllowed){
                return false;
            }
            if (currentTime+arr[i]<maxTimeAllowed){
                currentTime+=arr[i];
            }else{
                requiredPainters++;
                currentTime=arr[i];
            }
        } 
        return (requiredPainters<=k);
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
