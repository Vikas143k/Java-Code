public class recursion5_1 {
    // 0 1 1
    // c=a+b

    public static void fibb(int a, int b, int i) {
        if (i == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibb(b, c, i - 1);
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.print("0 1" + " ");
        fibb(0, 1, i - 2);

    }
}
