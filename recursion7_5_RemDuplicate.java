import java.util.Map;

public class recursion7_5_RemDuplicate {
    public static boolean[] map = new boolean[26];

    public static void remDup(String str, int idx, String nstr) {
        if (idx == str.length()) {
            System.out.println(nstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            remDup(str, idx + 1, nstr);
        } else {
            map[currchar - 'a'] = true;
            nstr += currchar;
            remDup(str, idx + 1, nstr);
        }
    }

    public static void main(String[] args) {
        String str = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        remDup(str, 0, "");
    }
}
