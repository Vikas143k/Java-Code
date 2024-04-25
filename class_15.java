import java.util.Scanner;

public class class_15 {
    public static void getBit(int n, int pos) {
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else
            System.out.println("Bit was non-zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int i = sc.nextInt();
        System.out.print("Enter the position");
        int pos = sc.nextInt();
        getBit(i, pos);
    }
}
