package pkg;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "This is testing string containing spaces";
        String s2 = "  hello world  ";
        String ans = reverseWords(s2);
        System.out.println(ans);
    }
    static String reverseWords(String s) {
        System.out.println(s);
        s = s.strip();
        String [] arr =  s.split(" ");
        String revString = "";
        for (int i = arr.length-1; i >=0; i--) {
            revString+=arr[i];
            if (i!=0){
                revString+=" ";
            }
            
        }
        return revString;
    }   
}
