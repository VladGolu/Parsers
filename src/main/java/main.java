import parsers.DOMParsers;
import parsers.JAXB2;
import parsers.SAXParsers;
import parsers.StaX;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws JAXBException, XMLStreamException, FileNotFoundException {
        System.out.println("\nSTAX начал работать");
        StaX stax = new StaX();
        stax.stax();
        System.out.println("STAX отработал");

        System.out.println("\nDOM начал работать");
        DOMParsers domParsers = new DOMParsers();
        domParsers.createDOMParserForCustomer();
        System.out.println("DOM отработал");

        System.out.println("\nSAX начинает работу");
        SAXParsers saxExample = new SAXParsers();
        saxExample.createSAX();
        System.out.println("SAX отработал");

        System.out.println("\nJAXB начал работать");
        JAXB2 jaxb2=new JAXB2();
        try {
            jaxb2.createJAXB();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("JAXB отработал");
    }
}
