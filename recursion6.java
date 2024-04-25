public class recursion6 {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // x^n=x*x^n-1;
        int xpownm1 = power(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}
