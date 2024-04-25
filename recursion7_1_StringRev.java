public class recursion7_1_StringRev {
    public static void strRev(String str, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.print(str.charAt(idx));
        strRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "Vikas Yadav";
        strRev(str, str.length() - 1);
    }
}
