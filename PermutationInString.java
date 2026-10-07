package pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        boolean ans = checkInclusion("ab", "eidbaooo");
        System.out.println(ans);
    }

    static boolean checkInclusion(String s1, String s2) {

        int []freq = new int[26];

        for (char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }

        int windSze = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            int [] windFreq = new int[26];
            int idx = i;
            int windIdx = 0;
            while (windIdx<windSze && idx<s2.length()) {
                windFreq[s2.charAt(windIdx)-'a']++;
                windIdx++;
                idx++;
            }
            if (matches(freq,windFreq)){
                return true;
            }
        }

        return false;
    }


    static boolean matches(int [] freq , int [] freq2){
        for (int i = 0; i < 26; i++) {
            if (freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    // non optimistic
    // static boolean checkInclusion(String s1, String s2) {
    // ArrayList<String> list = new ArrayList<>();
    // list.add("");
    // for (int i = 0; i < s1.length(); i++) {
    // char ch = s1.charAt(i);
    // ArrayList<String> local = new ArrayList<>();
    // for (int j = 0; j < list.size(); j++) {
    // String p = list.get(j);
    // for (int k = 0; k <= p.length(); k++) {
    // String f = p.substring(0, k);
    // String s = p.substring(k, p.length());
    // local.add(f + ch + s);
    // }
    // }
    // list = local;
    // }
    // System.out.println(list);
    // for (String test : list) {
    // if (s2.contains(test)) {
    // return true;
    // }
    // }
    // return false;
    // }
}
