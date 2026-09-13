package pkg;

public class RemoveAllOcuurances {
    public static void main(String[] args) {
        String ans = "daabcbaabcbc";
        System.out.println(removeOccurrences(ans, "abc"));
    }

    static String removeOccurrences(String s, String part) {
        if (s.isEmpty()) {
            return s;
        }

        if (s.startsWith(part)) {
            String newString = removeOccurrences(s.substring(part.length() - 1), part);
            return newString + s.charAt(part.length());
        } else {
            String newString = removeOccurrences(s.substring(1), part);
            return newString + s.charAt(0);
        }
    }

}
