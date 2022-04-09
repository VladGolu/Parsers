package beans;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {"customerId", "customerName", "customerAge", "customerAccount"})
public class Customer {

    @XmlElement
    private String customerId;
    @XmlElement
    private String customerName;
    @XmlElement
    private String customerAge;
    @XmlElement
    private Account customerAccount = new Account();



    public Customer() {
    }

    public Customer(String customerId, String customerName, String customerAge, Account customerAccount) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerAccount = customerAccount;
    }



    public String getCustomerAge() {
        return customerAge;
    }
    public Account getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Account customerAccount) {
        this.customerAccount = customerAccount;
    }
    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != null ? !customerId.equals(customer.customerId) : customer.customerId != null) return false;
        if (customerName != null ? !customerName.equals(customer.customerName) : customer.customerName != null)
            return false;
        if (customerAge != null ? !customerAge.equals(customer.customerAge) : customer.customerAge != null)
            return false;
        return customerAccount != null ? customerAccount.equals(customer.customerAccount) : customer.customerAccount == null;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerAge != null ? customerAge.hashCode() : 0);
        result = 31 * result + (customerAccount != null ? customerAccount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nCustomer" +
                "\ncustomerId='" + customerId + '\'' +
                "\ncustomerName='" + customerName + '\'' +
                "\ncustomerAge='" + customerAge + '\'' +
                "\ncustomerAccount='" + customerAccount + '\'';
    }
}

