package pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };
        merge(arr);
    }

    // old brute force approach

    static void merge(int[][] intervals) {
        int start = 0;
        int end = 1;
        List<List<Integer>> list = new ArrayList<>();
        for (int[] arr : intervals) {
            int s = list.size();
            for (int i = 0; i < intervals.length; i++) {
                if (Arrays.equals(arr, intervals[i])) {
                    continue;
                }
                ArrayList<Integer> inner = new ArrayList<>();

                if (intervals[i][start] <= arr[end] && arr[start] < intervals[i][end]
                        && arr[start] < intervals[i][start]) {
                    inner.add(arr[start]);
                    inner.add(intervals[i][end]);
                    list.add(inner);
                    continue;
                }
            }
            if (s == list.size()) {
                List<Integer> outer = new ArrayList<>();
                outer.add(arr[start]);
                outer.add(arr[end]);
                list.add(outer);
            }
        }

        System.out.println(list);
    }
}
