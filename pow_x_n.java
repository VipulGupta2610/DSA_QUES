package pkg;

public class pow_x_n {
    public static void main(String[] args) {
        double ans = myPow(2.0, -4);
        System.out.println(ans);
    }

    static double myPow(double x, int n) {
        int ans = 1;
        double base = x;
        if (n < 0) {
            System.out.println(-n);
            while (-n > 0) {
                if ((n&1)==1){
                    ans *=base;
                }
                base *=base;
                n = n>>1;
            }
            return 1/ans;
        } else {
            while (n > 0) {
                if ((n & 1) == 1) {
                    ans *= base;
                }
                base *= base;
                n = n >> 1;
            }
        }
        return ans;
    }
}
// package pkg;

// public class pow_x_n {
// public static void main(String[] args) {
// double ans = myPow(2.0, -3);
// System.out.println(ans);
// }

// static double myPow(double x, int n) {
// double sol = 1;
// if (n > 0) {
// System.out.println("Entered if area");
// for (int i = 1; i <= n; i++) {
// sol = sol * x;
// }
// } else {
// int num_after_divided = 1;
// System.out.println("Entered else area");
// for (int i = 1; i <= (-n); i++) {
// sol = sol * x;
// }
// return num_after_divided/sol;
// }
// return sol;
// }
// }