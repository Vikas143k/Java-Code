import java.util.Scanner;

public class class_10 {
    public static void searchIndex(int x[], int input, int find) {
        for (int i = 0; i < input; i++) {
            if (x[i] == find) {
                System.out.println("Found at Index:" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of input you want-->");
        int input = sc.nextInt();
        int x[] = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.print("Enter the number");
            x[i] = sc.nextInt();
        }
        System.out.print("Enter the number of which you want the index-->");
        int find = sc.nextInt();
        searchIndex(x, input, find);
    }
}
