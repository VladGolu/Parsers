package parsers;

import beans.Account;
import beans.Bank;
import beans.BankInfo;
import beans.Customer;
import dao.Customers;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParsers {

    public Customers customers = Customers.getInstance();

    public void createDOMParserForCustomer() {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dbb = dbf.newDocumentBuilder();
            File file = new File("Bank2.xml");
            Document doc = dbb.parse(file);
            NodeList child = doc.getChildNodes();

            String bankName = null;
            String bankId = null;
            String bankWebAddress = null;


            NodeList customersName = doc.getDocumentElement().getElementsByTagName("customerName");
            NodeList customersAge = doc.getDocumentElement().getElementsByTagName("customerAge");
            NodeList customerID = doc.getDocumentElement().getElementsByTagName("customerId");
            NodeList accountName = doc.getDocumentElement().getElementsByTagName("customerAccountName");
            NodeList accountPIN = doc.getDocumentElement().getElementsByTagName("customerAccountPIN");
            NodeList accountBalance = doc.getDocumentElement().getElementsByTagName("customerAccountBalance");
            NodeList accountCurrency = doc.getDocumentElement().getElementsByTagName("customerAccountCurrency");
            NodeList accountStatus = doc.getDocumentElement().getElementsByTagName("customerAccountStatus");

            for (int i = 0; i < child.getLength(); i++) {
                NodeList a = child.item(i).getChildNodes();
                for (int j = 0; j < a.getLength(); j++) {
                    NodeList b = a.item(j).getChildNodes();
                     for (int k = 0; k < b.getLength(); k++) {

                       if (b.item(k).getNodeName() == "bankName"){
                           bankName = b.item(k).getTextContent();

                       }
                         if (b.item(k).getNodeName() == "bankId"){
                              bankId = b.item(k).getTextContent();
                         }
                         if (b.item(k).getNodeName() == "bankWebAddress"){
                              bankWebAddress = b.item(k).getTextContent();
                         }
                     }
                }
           }
            BankInfo bankInfo=new BankInfo(bankName,bankId,bankWebAddress);

            for (int i = 0; i < customersName.getLength(); i++) {
                customers.addCustomer(new Customer(customerID.item(i).getTextContent(), customersName.item(i).getTextContent(), customersAge.item(i).getTextContent(), new Account(customerID.item(i).getTextContent(), accountName.item(i).getTextContent(), accountBalance.item(i).getTextContent(), accountCurrency.item(i).getTextContent(), accountPIN.item(i).getTextContent(), accountStatus.item(i).getTextContent())));
            }

            Bank bank= new Bank(bankInfo,customers);
            System.out.println(bank);

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        customers.deleteElem();
    }
}


