package pkg;

public class RemoveAllOcuurances {
    public static void main(String[] args) {
        String ans = "daabcbaabcbc";
        System.out.println(removeOccurrences(ans, "abc"));
    }

    static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = new StringBuilder(s).delete(0, 0).toString();
        }
    }
return s;
}
