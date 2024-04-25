import java.util.Scanner;

public class recursion5_0 {
    public static void power(int a, int x, int n) {
        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n == 1) {
            System.out.println(x);
            return;
        }
        if (x == 0) {
            System.out.println(0);
            return;
        }
        power(a, x * a, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:-");
        int x = sc.nextInt();
        System.out.print("Enter the Power:-");
        int n = sc.nextInt();
        int a = x;
        power(a, x, n);
    }
}
