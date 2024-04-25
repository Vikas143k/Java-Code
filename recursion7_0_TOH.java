public class recursion7_0_TOH {
    public static void TOH(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TOH(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        TOH(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 4;
        TOH(n, "S", "h", "D");
    }
}
