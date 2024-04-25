public class recursion1 {
    public static void number(int i) {
        if (i == 6) {
            return;
        }
        System.out.println(i);
        number(i + 1);
    }

    public static void main(String[] args) {
        int i = 1;
        number(i);
    }
}