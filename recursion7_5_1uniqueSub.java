import java.util.HashSet;
import java.util.Set;

public class recursion7_5_1uniqueSub {
    public static void subsequences(String str, int idx, String nstr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(nstr)) {
                return;
            } else {
                set.add(nstr);
                System.out.println(nstr);
                return;
            }

        }
        char currchar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, nstr + currchar, set);
        // not to be
        subsequences(str, idx + 1, nstr, set);
    }

    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        String str = "AaAaAa";
        subsequences(str, 0, "", set);
    }
}
