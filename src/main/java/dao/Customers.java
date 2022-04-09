package dao;

import beans.Customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers {

    @XmlElement(name = "customer")

    public List<Customer> customers=new ArrayList<>();
    private static final Customers INSTANCE = new Customers();
    public Customers(){}

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public boolean addCustomer(Customer customer){return customers.add(customer);}

    public static Customers getInstance() {
        return INSTANCE;
    }
    public static int getSize(List<Customer> customers) {
        return customers.size();
    }

    public Customer getCustomer(){
        for (int i = 0; i < customers.size(); i++) {
            return customers.get(i);
    }

        return null;
    }
    public void deleteElem(){
        customers.removeAll(customers);
    }



    @Override
    public String toString() {
        return "" + customers;
    }
}
