package pkg;

import java.util.ArrayList;

public class PermutationInString {
    public static void main(String[] args) {
        boolean ans = checkInclusion("ab", "eidbaooo");
        System.out.println(ans);
    }

    static boolean checkInclusion(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            ArrayList<String> local = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                String p = list.get(j);
                for (int k = 0; k <= p.length(); k++) {
                    String f = p.substring(0, k);
                    String s = p.substring(k, p.length());
                    local.add(f + ch + s);
                }
            }
            list = local;
        }
        for (String test : list) {
            if (s2.contains(test)) {
                return true;
            }
        }
        return false;
    }
}
