import java.util.Scanner;

public class crackAtmPin {
    public static void main(String[] args) {
        int x= 8276;
        System.out.println(x);
        for(int i=0; i<=9999;i++){
            String result = String.format("%04d", i);
            System.out.println("Attempt "+(i+1)+": Pin:"+result );
            if (i==x) {
                System.out.println("Correct Pin Found:-");
                System.out.println("Pin:"+ result);
                System.out.println("Attempts:-"+(i+1));
                break;
            }
        }
    }
}
