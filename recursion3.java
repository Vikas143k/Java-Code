public class recursion3 {
    public static void factorial(int fact, int n) {
        if (n == 1 || n == 0) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(fact, n - 1);
    }

    public static void main(String[] args) {
        int n = 0;
        factorial(1, n);
    }

}
