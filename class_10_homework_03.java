
//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.*;

public class class_10_homework_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Enter the number of values you want-->");
        int input = sc.nextInt();
        int x[] = new int[input];
        for (int i = 0; i < input; i++) {
            x[i] = sc.nextInt();
        }
        int y = 0;
        for (int i = 0; i < input - 1; i++) {
            if (x[i] > x[i + 1]) {
                System.out.println("Array is not in ascending order");
                y = 1;
                break;
            }
        }
        if (y == 0) {
            System.out.println("Array is in ascending order");
        }
    }
}
