import java.util.Scanner; 

 

public class CaesarCipher { 

   public static void main(String[] args) { 

       Scanner scanner = new Scanner(System.in); 

 

       // Input word to encrypt 

       System.out.print("Enter a word to encrypt: "); 

       String word = scanner.nextLine().toUpperCase(); 

 

       // Encrypt the word using a Caesar cipher with a random key (for demonstration) 

       int key = 5; // Example key (should be randomly generated in real scenarios) 

       String encryptedWord = encrypt(word, key); 

       System.out.println("Encrypted word: " + encryptedWord); 

 

       // Attempt to crack the key using brute force 

       System.out.println("Attempting to crack the key using brute force:"); 

       for (int i = 0; i < 26; i++) { // Brute force all possible keys 

           String decryptedWord = decrypt(encryptedWord, i); 

           System.out.println("Key " + i + ": " + decryptedWord); 

       } 

   } 

 

   private static String encrypt(String word, int key) { 

       StringBuilder encrypted = new StringBuilder(); 

       for (char ch : word.toCharArray()) { 

           if (Character.isLetter(ch)) { 

               char shifted = (char) ('A' + (ch - 'A' + key) % 26); 

               encrypted.append(shifted); 

           } else { 

               encrypted.append(ch); 

           } 

       } 

       return encrypted.toString(); 

   } 

 

   private static String decrypt(String encryptedWord, int key) { 

       return encrypt(encryptedWord, 26 - key); // Decrypt by shifting back by the key 

   } 

} 

 

 