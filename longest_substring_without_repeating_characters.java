package pkg;

import java.util.HashSet;
// import java.util.Set;

public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String str = "pwwkew";
        int ans = lengthOfLongestSubstring(str);
        System.out.println(ans);
    }
    static int lengthOfLongestSubstring(String s) {
        int longestLen = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int currentLen = 0;
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                ++currentLen;
                if (currentLen>longestLen){
                    longestLen=currentLen;
                }
            }
        }
        return longestLen;
    }
}