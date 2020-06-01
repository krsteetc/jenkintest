package hello;

import java.security.MessageDigest;
import java.util.Random;

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
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void rand() {
        Random random = new Random();
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
