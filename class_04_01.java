
//Table of a number given by the user
import java.util.*;

public class class_04_01 {
    public static void main(String[] args) {
        System.out.print("Please Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "X" + i + "=" + n * i);
        }
    }
}
