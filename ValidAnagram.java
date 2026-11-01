package pkg;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String t = "nagaram";
        String s = "anagram";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> s2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            s2.put(first, s2.getOrDefault(first, 0) + 1);
            s2.put(second, s2.getOrDefault(second, 0) - 1);
        }

        

        return true;

    }

    // brute force
    // static boolean isAnagram(String s, String t) {
    // boolean unique = true;
    // int count = 0;
    // char[] sArr = s.toCharArray();
    // char[] tArr = t.toCharArray();
    // for (char chr : sArr) {
    // for (int i = 0; i < tArr.length; i++) {
    // count ^= chr^tArr[i];
    // }
    // }
    // if (count != 0){
    // return true;
    // }
    // return false;
    // }
}