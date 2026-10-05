package pkg;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "This is testing string containing spaces";
        String s2 = "  hello world  ";
        String ans = reverseWords(s2);
        System.out.println(ans+" hello");
    }
    static String reverseWords(String s) {
        System.out.println(s);
        s = s.strip();
        System.out.println(s+"this is end");
        String [] arr =  s.trim().split("\\s+");
        System.out.println(Arrays.toString(arr));
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
