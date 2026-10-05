package pkg;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "This is testing string containing spaces";
        String s2 = "  hello world  ";
        String ans = reverseWords(s2);
        System.out.println(ans+" hello");
    }
    // accpetd
    static String reverseWords(String s) {
        String [] arr =  s.strip().split("\\s+");
        StringBuilder revString = new StringBuilder();
        for (int i = arr.length-1; i >=0; i--) {
            revString.append(arr[i]);
            if (i!=0){
                revString.append(" ");
            }
        }
        return revString.toString();
    }   
}
