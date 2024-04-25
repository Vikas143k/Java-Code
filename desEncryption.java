import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class desEncryption {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:-");
        String number=sc.next();
        String keyString = "01234567"; // 8-byte DES key

        String encrypted = encryptDES(number, keyString);
        System.out.println("Encrypted using DES: " + encrypted);
    }

    public static String encryptDES(String number, String keyString) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        DESKeySpec desKeySpec = new DESKeySpec(keyString.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey key = keyFactory.generateSecret(desKeySpec);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(number.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}