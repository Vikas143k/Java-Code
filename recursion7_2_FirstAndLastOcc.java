import java.lang.invoke.WrongMethodTypeException;

public class recursion7_2_FirstAndLastOcc {
    public static int first = -1;
    public static int last = -1;

    public static void FALO(int index, String str, char word) {
        if (index == str.length()) {
            System.out.println("The First occurence of " + word + " is at " + first);
            System.out.println("The last occurence of " + word + " is at " + last);
            return;
        }
        char currCh = str.charAt(index);
        if (currCh == word) {
            if (first == -1)
                first = index;
            else {
                last = index;
            }
        }
        FALO(index + 1, str, word);
    }

    public static void main(String[] args) {
        String str = "VikAs Yadavaaaaaaaa";
        char word = 'a';
        FALO(0, str, word);
    }

}
