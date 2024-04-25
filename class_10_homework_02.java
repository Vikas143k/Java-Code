
//Find the maximum & minimum number in an array of integers.
import java.util.Scanner;

public class class_10_homework_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min;
        // input
        System.out.print("Enter the number of values you want-->");
        int input = sc.nextInt();
        int x[] = new int[input];
        for (int i = 0; i < input; i++) {
            x[i] = sc.nextInt();
        }
        max = x[0];
        min = x[0];
        for (int i = 0; i < input; i++) {
            if (max < x[i]) {
                max = x[i];
            } else {
                min = x[i];
            }
        }
        System.out.println("max value->" + max);
        System.out.println("Min value->" + min);
    }
}
