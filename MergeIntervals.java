package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] arr = {
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };
        merge(arr);
    }
    static void merge(int[][] intervals) {
        int start = 0;
        int end = 1;
        List<List<Integer>> list = new ArrayList<>();
        for (int [] arr : intervals){
            for (int i = 0; i < intervals.length; i++) {
                if (Arrays.equals(arr, intervals[i])){
                    continue;
                }
                ArrayList<Integer> inner = new ArrayList<>();
                if (arr[end]<=intervals[i][start] && arr[start]<intervals[i][end]){

                }
            }
        }
    }
}
