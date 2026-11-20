package pkg;

public class Largest_reactangle_in_histogram {
    public static void main(String[] args) {
        
    }
    // using two pointer aproach
    static int largestRectangleArea(int[] heights) {
        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length-1;
        while (left<right) {
            int wdt = right-left;
            int hgt = Math.min(heights[left], heights[right]);
            int area = wdt*hgt;
            ans = area>ans?area:ans;
            if (heights[left]<heights[right]){
                left++;
            }else{
                right++;
            }
        }
        return ans;
    }
}
