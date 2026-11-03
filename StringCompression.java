package pkg;

import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int ans = compress(arr);
        System.out.println(ans);
    }

    static int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                 map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
            }else{
                map.put(chars[i], 1);
            }
        }
    }

    // brute force
    // static int compress(char[] chars) {
    // String s = "";
    // for (int i = 0; i < chars.length; i++) {
    // char ch = chars[i];
    // if (s.contains(String.valueOf(ch))) {
    // if (s.charAt(s.length() - 1) == ch) {
    // s = s + "2";
    // } else {
    // char ch1 = s.charAt(s.length() - 1);
    // ch1++;
    // }
    // }
    // else{
    // s = s+ch;
    // }
    // }
    // return s.length();
    // }
}
