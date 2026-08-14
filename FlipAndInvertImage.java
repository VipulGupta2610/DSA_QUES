package pkg;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(Arrays.deepToString(image));
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0;
            int end = image[i].length - 1;
            System.out.println(Arrays.toString(image[i]));
            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                image[i][start] ^= 1;
                image[i][end] ^= 1;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(image[i]));
        }
        return image;
    }
}
