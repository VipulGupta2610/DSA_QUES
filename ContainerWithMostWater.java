package pkg;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int ans = maxArea(arr);
        System.out.println(ans);
    }

    static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int maxLine=0;
            int maxIdx=i+1;
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > maxLine) {
                    maxLine = height[j];
                    maxIdx = j;
                }
            }
            int calcmax=0;
            if (height[maxIdx] < height[i]) {
                calcmax = (maxIdx - i) * height[maxIdx];
            } else {
                calcmax = (maxIdx - i) * height[i];
            }
            if (max < calcmax) {
                max = calcmax;
            }
        }
        return max;
    }
}
