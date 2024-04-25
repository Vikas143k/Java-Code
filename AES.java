import javax.crypto.Cipher;

import javax.crypto.SecretKey;

import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;

public class AES {

    public static void main(String[] args) throws Exception {

        String number = "639919600666";

        String keyString = "0123456789abcdef"; // 16-byte AES key

        String encrypted = encryptAES(number, keyString);

        System.out.println("Encrypted using AES: " + encrypted);

    }

    public static String encryptAES(String number, String keyString) throws Exception {

        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

        SecretKey key = new SecretKeySpec(keyString.getBytes(), "AES");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encryptedBytes = cipher.doFinal(number.getBytes());

        return Base64.getEncoder().encodeToString(encryptedBytes);

    }

}