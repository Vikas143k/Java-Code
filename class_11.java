import java.util.Scanner;

public class class_11 {
    public static void main(String[] args) {
        int row, cols;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        row = sc.nextInt();
        System.out.print("Enter the number of Column");
        cols = sc.nextInt();
        int[][] x = new int[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number you want to find the index");
        int number = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (x[i][j] == number) {
                    System.out.println("The index of the number is" + "(" + i + "," + j + ")");
                    temp = 1;
                    break;
                }
            }
            System.out.println();
        }
        if (temp == 0) {
            System.out.println("Not in matrix");
        }
    }
}
