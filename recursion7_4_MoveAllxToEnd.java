public class recursion7_4_MoveAllxToEnd {
    public static void move(String str, int idx, int count, String nstr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                nstr += 'x';
            }
            System.out.println(nstr);
            return;
        }
        if (str.charAt(idx) == 'x') {
            move(str, idx + 1, count + 1, nstr);
        } else {
            nstr += str.charAt(idx);
            move(str, idx + 1, count, nstr);
        }
    }

    public static void main(String[] args) {
        String str = "axbxcxx";
        System.out.println("--------------");
        move(str, 0, 0, "");
    }
}
