package pkg;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };
        int[][] ans = merge(arr);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            }else{
                list.add(new int[] { start, end });
                start = currentStart;
                end = currentEnd;
            }
        }
        list.add(new int[] { start, end });
        return list.toArray(new int[list.size()][]);
    }

    // old brute force approach
    // static void merge(int[][] intervals) {
    // int start = 0;
    // int end = 1;
    // List<List<Integer>> list = new ArrayList<>();
    // for (int[] arr : intervals) {
    // int s = list.size();
    // for (int i = 0; i < intervals.length; i++) {
    // if (Arrays.equals(arr, intervals[i])) {
    // continue;
    // }
    // ArrayList<Integer> inner = new ArrayList<>();

    // if (intervals[i][start] <= arr[end] && arr[start] < intervals[i][end]
    // && arr[start] < intervals[i][start]) {
    // inner.add(arr[start]);
    // inner.add(intervals[i][end]);
    // list.add(inner);
    // continue;
    // }
    // }
    // if (s == list.size()) {
    // List<Integer> outer = new ArrayList<>();
    // outer.add(arr[start]);
    // outer.add(arr[end]);
    // list.add(outer);
    // }
    // }

    // System.out.println(list);
    // }
}
