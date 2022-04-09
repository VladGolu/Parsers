package parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SAXParsers {


    public void createSAX() {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

        XMLHandler handler = new XMLHandler();
        try {
            parser.parse(new File("Bank2.xml"), handler);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static class XMLHandler extends DefaultHandler {
        boolean bankName = false;
        boolean bankId = false;
        boolean bankWebAddress = false;
        boolean cusId = false;
        boolean cusName = false;
        boolean cusAge = false;
        boolean cusAccId = false;
        boolean cusAccName = false;
        boolean cusAccPIN = false;
        boolean cusAccCurrency = false;
        boolean cusAccBalance = false;
        boolean cusAccStatus = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            if (qName.equals("bankName")) {
                bankName = true;
            }
            if (qName.equals("bankId")) {
                bankId = true;
            }
            if (qName.equals("bankWebAddress")) {
                bankWebAddress = true;
            }
            if (qName.equals("customerId")) {
                cusId = true;
            }
            if (qName.equals("customerName")) {
                cusName = true;
            }
            if (qName.equals("customerAge")) {
                cusAge = true;
            }
            if (qName.equals("customerAccountId")) {
                cusAccId = true;
            }
            if (qName.equals("customerAccountName")) {
                cusAccName = true;
            }
            if (qName.equals("customerAccountPIN")) {
                cusAccPIN = true;
            }
            if (qName.equals("customerAccountCurrency")) {
                cusAccCurrency = true;
            }
            if (qName.equals("customerAccountBalance")) {
                cusAccBalance = true;
            }
            if (qName.equals("customerAccountStatus")) {
                cusAccStatus = true;
            }


        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);

            if (bankName) {
                System.out.println("Имя банка " + new String(ch, start, length));
                bankName = false;
            }
            if (bankId) {
                System.out.println("ID банка" + new String(ch, start, length));
                bankId = false;
            }
            if (bankWebAddress) {
                System.out.println("Сайт банка " + new String(ch, start, length));
                bankWebAddress = false;
            }

            if (cusId) {
                System.out.println("\nНовый пользователь");
                System.out.println("ID пользоваателя " + new String(ch, start, length));
                cusId = false;
            }
            if (cusName) {
                System.out.println("Имя пользоваателя " + new String(ch, start, length));
                cusName = false;
            }
            if (cusAge) {
                System.out.println("Возраст пользоваателя " + new String(ch, start, length));
                cusAge = false;
            }
            if (cusAccId) {
                System.out.println("Новый аккаунт");
                System.out.println("ID аккаунта " + new String(ch, start, length));
                cusAccId = false;
            }
            if (cusAccName) {
                System.out.println("Имя аккаунта пользоваателя " + new String(ch, start, length));
                cusAccName = false;
            }
            if (cusAccPIN) {
                System.out.println("PIN " + new String(ch, start, length));
                cusAccPIN = false;
            }
            if (cusAccCurrency) {
                System.out.println("Валюта " + new String(ch, start, length));
                cusAccCurrency = false;
            }
            if (cusAccBalance) {
                System.out.println("Баланс " + new String(ch, start, length));
                cusAccBalance = false;
            }
            if (cusAccStatus) {
                System.out.println("Статус аккаунта " + new String(ch, start, length));
                cusAccStatus = false;
            }
        }
    }
}