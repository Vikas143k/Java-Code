public class recursion7_5_Subsequences {
    public static void subsequences(String str, int idx, String nstr) {
        if (idx == str.length()) {
            System.out.println(nstr);
            return;
        }
        char currchar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, nstr + currchar);
        // not to be
        subsequences(str, idx + 1, nstr);
    }

    public static void main(String[] args) {
        String str = "aaa";
        subsequences(str, 0, "");
    }
}
