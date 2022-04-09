package parsers;

import beans.Bank;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

public class JAXB2 {
    public void createJAXB() throws JAXBException, FileNotFoundException {

        File file = new File("Bank2.xml");

        JAXBContext context = JAXBContext.newInstance(Bank.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        Bank bank = (Bank) unmarshaller.unmarshal(file);

        System.out.println(bank);

    }

}



