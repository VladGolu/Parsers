package parsers;

import beans.Customer;
import dao.Customers;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaX {
    String customerName;
    String customerAge;
    String customerID;
    String accountId;
    String accountName;
    String accountBalance;
    String accountPIN;
    String accountCurrency;
    String accountStatus;

    public Customers customers = Customers.getInstance();

    public void stax() throws XMLStreamException, FileNotFoundException {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("Bank2.xml"));

        while (reader.hasNext()) {

            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();

                if ("customerName".equals(startElement.getName().getLocalPart())) {
                    customers.addCustomer(new Customer());
                    nextEvent = reader.nextEvent();
                    customerName = nextEvent.asCharacters().getData();
                    System.out.println("Имя пользователя: " +customerName);
                }
                if ("customerAge".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    customerAge = nextEvent.asCharacters().getData();
                    System.out.println("Возраст: " + customerAge);
                }
                if ("customerId".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    customerID = nextEvent.asCharacters().getData();

                    System.out.println("\nНовый пользователь: " + "\nID пользователя " + customerID);
                }

                if ("customerAccountId".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    accountId = nextEvent.asCharacters().getData();
                    System.out.println("Аккаунт ID: " + accountId);
                }
                if ("customerAccountName".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    accountName = nextEvent.asCharacters().getData();
                    System.out.println("Имя аккаунта: " + accountName);
                }
                if ("customerAccountBalance".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    accountBalance = nextEvent.asCharacters().getData();
                    System.out.println("ID аккаунта: " + accountBalance);
                }
                if ("customerAccountPIN".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    accountPIN = nextEvent.asCharacters().getData();
                    System.out.println("PIN аккаунта: " + accountPIN);
                }
                if ("customerAccountCurrency".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    accountCurrency = nextEvent.asCharacters().getData();
                    System.out.println("Валюта аккаунта: " + accountCurrency);

                }
                if ("customerAccountStatus".equals(startElement.getName().getLocalPart())) {
                    nextEvent = reader.nextEvent();
                    accountStatus = nextEvent.asCharacters().getData();
                    System.out.println("Статус: " + accountStatus);
                }
            }

        }
    }
}



