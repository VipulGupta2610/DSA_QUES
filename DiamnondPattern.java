package pkg;

public class DiamnondPattern {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 0; i < (n / 2) + 1; i++) {
            int totalcols = 2 * i + 1;
            int totalspace = (n - totalcols) / 2;
            for (int spaces = totalspace; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int cols = totalcols; cols > 0; cols--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = n/2; j>0; j--){
            int totalcols = (2*j)-1;
            int totalspace = (n-totalcols)/2;
            for (int spaces = totalspace; spaces>0; spaces--){
                System.out.print(" ");
            }
            for (int cols = totalcols; cols>0; cols--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}