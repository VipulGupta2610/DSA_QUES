package pkg;

public class StringCompression {
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int ans = compress(arr);
        System.out.println(ans);
    }

    // brute force
    static int compress(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (s.contains(String.valueOf(ch))) {
                if (s.charAt(s.length() - 1) == ch) {
                    s = s + "2";
                } else {
                    char ch1 = s.charAt(s.length() - 1);
                    ch1++;
                }
            }
            else{
                s = s+ch;
            }
        }
        return s.length();
    }
}
