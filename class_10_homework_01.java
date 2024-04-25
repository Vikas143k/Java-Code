import java.util.*;

public class class_10_homework_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of input you want");
        int size = sc.nextInt();
        String x[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Name->");
            x[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }
}
