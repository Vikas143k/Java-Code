
//sum of first n terms
import java.util.Scanner;

public class recursion2 {
    public static void sum(int i, int n, int sum) {
        if (i == n + 1) {
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:-");
        int n = sc.nextInt();
        sum(1, n, 0);

    }
}
