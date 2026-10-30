package pkg;

import java.util.HashSet;
// import java.util.Set;

public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String str = "bbbbb";
        int ans = lengthOfLongestSubstring(str);
        System.out.println(ans);
    }

    // optimised try
    static int lengthOfLongestSubstring(String s){
        int longestLen=0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while (j<s.length()) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                longestLen = Math.max(longestLen, j-i+1);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return longestLen;
    }

    // brute force
    // static int lengthOfLongestSubstring(String s) {
    //     int longestLen = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         HashSet<Character> set = new HashSet<>();
    //         for (int j = i; j < s.length(); j++) {
    //             if (set.contains(s.charAt(j))) {
    //                 break;
    //             }
    //             set.add(s.charAt(j));
    //             if (set.size() > longestLen) {
    //                 longestLen = set.size();
    //             }
    //         }
    //     }
    //     return longestLen;
    // }
}