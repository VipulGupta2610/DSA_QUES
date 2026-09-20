package pkg;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int ans = maxArea(arr);
        System.out.println(ans);
    }


    

    // non- optimistic
    static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int leftLine = height[i];
            for (int j = i+1; j < height.length; j++) {
                int rightLine = height[j];
                int hgt = leftLine<=rightLine?leftLine:rightLine;
                int wdt = j-i;
                int amt = hgt*wdt;
                if (amt>max){
                    max = amt;
                }
            }
        }
        return max;
    }
}
