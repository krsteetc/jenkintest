package hello;

import java.security.MessageDigest;
import java.util.Random;
import javax.crypto.Cipher;

public class Hello {

    public static void main(String[] a) {
        sha1();
    }

    public static void sha1() {
        try {
            MessageDigest sha1Digest = MessageDigest.getInstance("SHA1");
            sha1Digest.update("pass".getBytes());
            byte[] hashValue = sha1Digest.digest();

            System.out.println(hashValue);

            rand();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void rand() {
        Random random = new Random();
        try {
            Cipher c0 = Cipher.getInstance("AES"); // Noncompliant: by default ECB mode is chosen
        }catch (Exception e){

        }
    }

    public static void injection1() {
        try {
            String className = System.getProperty("messageClassName");
            Class clazz = Class.forName(className);  // Noncompliant
            System.out.println(clazz.getConstructors());
        } catch (Exception e) {

        }
    }
}
