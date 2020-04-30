import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.*;
import java.util.Random;

import static java.util.jar.Pack200.Packer.PASS;

public class Hello {
    public static void main(String[] a) {
        String version = "a";
        Random random = new Random();

//        int unusedAAAAAA=0;
//        int unusedAAAAAAA2 = 10;
//        int unusedAAAAA3 = random.nextInt();
//        int unusedAAAAAA4 = 10;
//        System.out.println("hahahaha");
//        if (unusedAAAAA3 > 0) {
//            int unhahaha  = 100;
//            unusedAAAAAA = 1;
//            System.out.println("a");
//        } else {
//            System.out.println("b");
//        }
//        System.out.println(" aa "+unusedAAAAAA);

        sha1();
    }

    //        int unused;
//        int unused2 = 10;
//        int unused3 = 10;
//        int unused4 = 10;
//        System.out.println("sonar testin");
//
//        Random r = new Random();
//        int aa = r.nextInt();
//
//        String password = "password";
//
//
//        StaticCodeExample ssss = new StaticCodeExample();
//        ssss.test();
//
//        DocBuilder.fun();
//
//        try {
//            r.nextBoolean();
//            run1();
//            run2(1);
//            run3("1");
//            secureRandom();
//            injection1();
//            selectExample("a");
//            fun();
//            sha1();
//        } catch (Exception e) {
//        } finally {
//
//        }
//    }
//
    public static void sha1() {

        try {
            MessageDigest sha1Digest = MessageDigest.getInstance("SHA1");
            sha1Digest.update("pass".getBytes());
            byte[] hashValue = sha1Digest.digest();

            //byte[] hashValue2 = DigestUtils.getSha1Digest().digest("pass".getBytes());
            System.out.println(hashValue);
        } catch (Exception e) {

        }
    }
//
//    private static void secureRandom(){
//        SecureRandom sr = new SecureRandom();
//        sr.setSeed(123456L); // Noncompliant
//        int v = sr.nextInt(32);
//
//        try {
//            sr = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii")); // Noncompliant
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        v = sr.nextInt(32);
//    }
//
//    public static void injection1(){
//        try {
//            String className = System.getProperty("messageClassName");
//            Class clazz = Class.forName(className);  // Noncompliant
//            System.out.println(clazz.getConstructors());
//        } catch (Exception e){
//
//        }
//    }
//
//    public static void selectExample(String parameter) throws SQLException {
//        Connection connection = DriverManager.getConnection("DB_URL", "USER", PASS);
//        String query = "SELECT * FROM USERS WHERE lastname = " + parameter;
//        Statement statement = connection.createStatement();
//        ResultSet result = statement.executeQuery(query);
//
//        System.out.println(result);
//    }
//
//    private static void run3(String a){
//        StringBuilder query = new StringBuilder();
//        query.append( "select * from user u where u.name in (" + a + ")" );
//        try {
//            Connection connection = null;
//            Statement statement = connection.createStatement();
//            statement.executeQuery(query.toString());
//        } catch (Exception e){
//
//        }
//    }
//
//    private static void run2(int i) {
//        if (i == 0) {
//            // TODO: handle this case
//        }
//
//        if (1 < 0) {
//            throw new RuntimeException("hoho");
//        }
//
//        int i2 = i * i;
//        String s = null;
//        if (i2 > 10) {
//            s = "yes";
//        }
//        s.substring(1);
//
//
//        if((123 * 5) % 1 == 0){
//            s = "yes";
//        }
//
//        int x = 3;
//        x = x;
//    }
//
//    private static void run1() {
//        System.out.println("run1");
//    }
//
//
//    public static void fun(){
//        String unused;
//
//        // create a new DocumentBuilderFactory
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//
//        try {
//            // use the factory to create a documentbuilder
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            // create a new document from input source
//            FileInputStream fis = new FileInputStream("Student.xml");
//            InputSource is = new InputSource(fis);
//            Document doc = builder.parse(is);
//
//            // get the first element
//            Element element = doc.getDocumentElement();
//
//            // get all child nodes
//            NodeList nodes = element.getChildNodes();
//
//            // print the text content of each child
//            for (int i = 0; i < nodes.getLength(); i++) {
//                System.out.println("" + nodes.item(i).getTextContent());
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

}
