package pkg;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "This is testing string containing spaces";
        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
