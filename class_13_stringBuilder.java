public class class_13_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("hello");
        StringBuilder scAfter = new StringBuilder("");
        for (int i = 4; i >= 0; i--) {
            scAfter.append(sc.charAt(i));
            System.out.println(scAfter);
        }

    }

}
