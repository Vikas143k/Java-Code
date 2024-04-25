
public class class_05_patterns {
    public static void main(String[] args) {
        /*
         * solid rectangle
         *****
         *****
         *****
         *****
         * 
         * //row=4, column=5
         * int r = 4, c = 5;
         * //Outer loop
         * for (int i = 0; i < r; i++) {
         * //inner loop
         * for (int j = 0; j < c; j++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * 
         * }
         * 
         * Missing Pattern
         *****
         * *
         * *
         *****
         * 
         * // Outer loop
         * int r = 10, c = 20;
         * for (int i = 0; i < r; i++) {
         * for (int j = 0; j < c; j++) {
         * if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         * Half Pyramid
         *
         **
         ***
         ****
         *****
         * 
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 0; j < i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * Half Inverted Pyramid
         * !!!!*
         * !!!**
         * !!***
         * !****
         * 
         * int n = 5,m=0;
         * for (int i = n; i > 0; i--) {
         * for (int j = i - 1; j > 0; j--) {
         * System.out.print(" ");
         * }
         * m += 1;
         * for (int k = 0; k < m; k++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * Half Pyramid with numbers
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 
         * int n = 5;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         * 
         * int n = 5;
         * for (int i = 0; i <= n; i++) {
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         * Floyd's Triangle
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * int n = 5, m = 1;
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j <= i; j++) {
         * System.out.print(m + " ");
         * m += 1;
         * }
         * System.out.println();
         * }
         * //O-1 Triangle
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */
    }
}
