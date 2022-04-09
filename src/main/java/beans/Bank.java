package beans;

import dao.Customers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bank",propOrder = {"bankInfo", "customers"} )
public class Bank {

    private BankInfo bankInfo= new BankInfo();
    private Customers customers= new Customers();

    public Bank() {
    }


    public Bank(BankInfo bankInfo, Customers customers) {
        this.bankInfo = bankInfo;
        this.customers = customers;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (bankInfo != null ? !bankInfo.equals(bank.bankInfo) : bank.bankInfo != null) return false;
        return customers != null ? customers.equals(bank.customers) : bank.customers == null;
    }

    @Override
    public int hashCode() {
        int result = bankInfo != null ? bankInfo.hashCode() : 0;
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bank" +
                "\n" + bankInfo +
                "\n" + customers;
    }
}
