package pkg;

public class RemoveAllOcuurances {
    public static void main(String[] args) {
        String ans = "daabcbaabcbc";
        System.out.println(removeOccurrences(ans, "apple"));
    }

    static String removeOccurrences(String s, String part) {
        if (s.isEmpty()) {
            return s;
        }
        if (s.startsWith(part)) {
            String newString = removeOccurrences(s.substring(part.length()), part);
            return s.charAt(part.length())+newString;
        } else {
            String newString = removeOccurrences(s.substring(1), part);
            return s.charAt(0) + newString;
        }
    }

}
