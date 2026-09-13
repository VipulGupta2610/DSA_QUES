package pkg;

public class RemoveAllOcuurances {
    public static void main(String[] args) {
        String ans = "daabcbaabcbc";
        System.out.println(removeOccurrences(ans, "abc"));
    }

    static String removeOccurrences(String s, String part) {
        String newstring = s;
        String ans="";
        int i = 0;
        while (i<newstring.length()) {
            String tString = newstring.substring(i);
            if(tString.startsWith(part)){
                newstring += newstring.substring(i, part.length())+newstring.substring(part.length(),newstring.length());
                i=0;
            }else{
                i++;
            }
        }
        ans = newstring;
        return  ans;
    }

}
