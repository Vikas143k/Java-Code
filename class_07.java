import java.util.*;

public class class_07 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
    }

    public static int caculateProduct(int a, int b) {
        return a * b;

    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the first number");
    // int a = sc.nextInt();
    // System.out.print("Enter the second number");
    // int b = sc.nextInt();
    // int result = caculateProduct(a, b);
    // System.out.println(result);
    // }

}
