import java.util.Scanner;

public class bubbleShort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = { 2, 4, 12, 34, 45, 23, 12, 1, 5 };
        System.out.print(")");
        // Bubblesort
        // time complelist.lengthity=O(n^2)
        for (int j = list.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (list[i] > list[i + 1]) {
                    int c = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = c;
                }
            }

        }
        System.out.println("");
        // printing sorted list
        System.out.println("********printing after shorting**********");
        System.out.print("(");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i != list.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print(")");
    }
}
