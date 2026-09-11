package pkg;

public class RemoveAllOcuurances {
    public static void main(String[] args) {
        String ans = "abcdappledb";
        System.out.println(removeOccurrences(ans, "apple"));
    }

    static String removeOccurrences(String s, String part) {
        if (s.isEmpty()){
            return s;
        }
        String newString="";
        if (s.startsWith(part)){
             newString=removeOccurrences(s.substring(part.length()), part);
        }else{
             newString=removeOccurrences(s.substring(0), part);
        }
        return newString;
    }

}
