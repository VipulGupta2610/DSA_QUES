package pkg;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    static boolean isPalindrome(String s) {
        s.replaceAll("[^a-zA-Z0-9]", "")
        int start = 0;
        int end = s.length()-1;
        while (start<=end) {
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return  true;
    }
}