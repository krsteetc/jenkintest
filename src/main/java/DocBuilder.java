import org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;

public class DocBuilder {

    public static void fun(){
        String unused;

        // create a new DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            // use the factory to create a documentbuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // create a new document from input source
            FileInputStream fis = new FileInputStream("Student.xml");
            InputSource is = new InputSource(fis);
            Document doc = builder.parse(is);

            // get the first element
            Element element = doc.getDocumentElement();

            // get all child nodes
            NodeList nodes = element.getChildNodes();

            // print the text content of each child
            for (int i = 0; i < nodes.getLength(); i++) {
                System.out.println("" + nodes.item(i).getTextContent());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
