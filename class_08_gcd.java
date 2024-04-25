import java.util.*;

public class class_08_gcd {
    public static int lcm(int a, int b) {
        int result = 1, greater;
        greater = Math.max(a, b);
        for (int i = 2; i <= greater; i++) {
            if (a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
                result = result * i;
                i = i - 1;
            } else if (a % i == 0) {
                a = a / i;
                result = result * i;
                i = i - 1;
            } else if (b % i == 0) {
                b = b / i;
                result = result * i;
                i = i - 1;
            }
        }
        return result;
    }

    public static int greaterCommmonDivisior(int a, int b, int lcm) {
        return (a * b) / (lcm);
    }

    public static void main(String[] args) {
        int lcm, answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number->");
        int a = sc.nextInt();
        System.out.print("Enter the second number->");
        int b = sc.nextInt();
        lcm = lcm(a, b);
        System.out.println(lcm);
        answer = greaterCommmonDivisior(a, b, lcm);
        System.out.println("GCD of the number->" + answer);
    }
}
