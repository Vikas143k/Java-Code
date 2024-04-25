
//Take an array of names as input from the user and print them on the screen.
import java.util.*;

public class class_11_homework {
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
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }

}
