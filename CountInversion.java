package pkg;

import java.util.List;

public class CountInversion {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,1,3,5);
        int ans = countInversions(list);
        System.out.println(ans);
    }

    static int countInversions(List<Integer> arr) {
        int n = arr.size()-1;
        int[] nums = arr.stream().mapToInt(Integer::intValue).toArray();
        return mergeSort(nums,0,n);
    }

    static int mergeSort(int []arr , int start , int end){
        int count=0;
        if (start<end){
            int mid = start + (end - start )/2;
            int mg1 = mergeSort(arr, start, mid);
            int mg2 = mergeSort(arr, mid+1, end);
            int mrg = merge(arr,start,mid,end);
            count = mg1+mg2+mrg;
        }
        return count;
    }

    static int merge(int []arr , int start,int mid, int end){
        int n1 = mid-start+1;
        int n2 = end - mid;
        int []left = new int[n1];
        int[] right = new int[n2];
        int lefti = start;
        int righti = mid+1;
        for (int i = 0; i <left.length; i++) {
            left[i] = arr[lefti];
            lefti++;
        } 
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[righti];
            righti++;
        } 
        int i = 0 , j=0 , k=start , count=0;
        while (i<n1 && j<n2) {
            if (left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                count+= (n1 - i);
            }
        }
        while (i<n1) {
            arr[k++]=left[i++];
        }
        while (j<n2) {
            arr[k++]=right[j++];
        }
        return count;
    }

    // brute force
    // static int countInversions(int[] nums) {
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         long first = nums[i];
    //         for (int j = i + 1; j < nums.length; j++) {
    //             long second = nums[j];
    //             if (first >  second) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

}
