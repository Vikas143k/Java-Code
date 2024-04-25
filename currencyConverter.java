import java.text.NumberFormat;
import java.util.Locale;

public class currencyConverter {
    public static void main(String[] args) {
        double myNumber=1232.23;
       NumberFormat nf=NumberFormat.getInstance();
        String us=nf.getCurrencyInstance(Locale.US).format(myNumber);
        String india=nf.getCurrencyInstance(Locale.of("en", "in")).format(myNumber);
        String china=nf.getCurrencyInstance(Locale.CHINA).format(myNumber);
        String france=nf.getCurrencyInstance(Locale.FRANCE).format(myNumber);

        System.out.println(us);
        System.out.println(india);
        System.out.println(china);
        System.out.println(france);
    }
}
