import javax.crypto.Cipher; 

import javax.crypto.SecretKey; 

import javax.crypto.SecretKeyFactory; 

import javax.crypto.spec.DESedeKeySpec; 

import java.security.InvalidKeyException; 

import java.util.Base64; 

 

public class tripleDES { 

 public static void main(String[] args) throws Exception { 

String number = "639919600666"; 

 String keyString = "0123456789abcdefghijABCDE"; // 24-byte 3DES key 

 

 String encrypted = encryptTripleDES(number, keyString); 

System.out.println("Encrypted using Triple DES: " + encrypted); 

 } 

 

public static String encryptTripleDES(String number, String keyString) throws Exception { 

Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding"); 

DESedeKeySpec desKeySpec = new DESedeKeySpec(keyString.getBytes()); 

 SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede"); 

 SecretKey key = keyFactory.generateSecret(desKeySpec); 

 cipher.init(Cipher.ENCRYPT_MODE, key); 

 byte[] encryptedBytes = cipher.doFinal(number.getBytes()); 

 return Base64.getEncoder().encodeToString(encryptedBytes); 

 } 

} 