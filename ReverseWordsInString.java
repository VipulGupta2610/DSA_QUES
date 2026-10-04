package pkg;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "This is testing string containing spaces";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
    static String reverseWords(String s) {
        String [] arr =  s.split(" ");
        String revString = "";
        for (int i = arr.length-1; i >=0; i--) {
            revString+=arr[i];
        }
        return revString;
    }   
}
