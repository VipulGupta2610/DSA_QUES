package pkg;

import java.util.HashSet;
// import java.util.Set;

public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        
    }
    static int lengthOfLongestSubstring(String s) {
        int longestLen = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                longestLen++;
            }
        }
        return longestLen;
    }
}