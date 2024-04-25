public class recursion7_6_keypadMapping {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void keymap(int numb, int idx, String combination) {
        if (numb < 1) {
            System.out.println(combination);
            return;
        }

    }

    public static void main(String[] args) {
        keymap(4, 0, "");
    }
}
