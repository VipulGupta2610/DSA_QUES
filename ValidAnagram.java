package pkg;

public class ValidAnagram {

    public static void main(String[] args) {
        String t = "nagaram";
        String s = "anagram";
        System.out.println(isAnagram(s, t));
    }

    static boolean isAnagram(String s, String t) {
        boolean unique = true;
        int count = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (char chr : sArr) {
            for (int i = 0; i < tArr.length; i++) {
                count ^= chr^tArr[i];
            }
        }
        if (count != 0){
            return true;
        }
        return false;
    }
}