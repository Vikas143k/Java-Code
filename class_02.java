
//variables
import java.util.*;

public class class_02 {
    public static void main(String[] args) {
        // variables
        int a = 34, b = 50;
        String city = "Greater Noida";
        double x = 34.34;

        // BODMAS does not apply in JAVA
        // priority is */%>+-
        int cal;
        cal = a + b / a * b;
        System.out.println(cal);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
    }
}
