public class recursion4 {
    public static void fibonacci(int a, int b, int c, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(c + " ");
        fibonacci(b, c, c + b, n - 1);

    }

    public static void main(String[] args) {
        int n = 7;
        fibonacci(-1, 1, 0, n);
    }
}
