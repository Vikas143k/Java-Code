import java.util.*;

public class class_08_fibbonaci {
    // 0 1 1 2 3 5 8 13 24....
    public static void fibbonaci(int input) {
        int a = 1, b = 0, c = 0;
        for (int i = 0; i < input; i++) {
            System.out.print(b + " ");
            c = b;
            b = b + a;
            a = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number->");
        int input = sc.nextInt();
        fibbonaci(input);

    }

}
