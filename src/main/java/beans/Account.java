package beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="customerAccount",propOrder = {"customerAccountId","customerAccountPIN","customerAccountName","customerAccountBalance","customerAccountCurrency","customerAccountStatus"})
public class Account {

    String customerAccountId;
    String customerAccountName;
    String customerAccountBalance;
    String customerAccountCurrency;
    String customerAccountPIN;
    String customerAccountStatus;

    public Account() {}

    public Account(String customerAccountId, String customerAccountName, String customerAccountBalance, String customerAccountCurrency, String customerAccountPIN, String customerAccountStatus) {
        this.customerAccountId = customerAccountId;
        this.customerAccountName = customerAccountName;
        this.customerAccountBalance = customerAccountBalance;
        this.customerAccountCurrency = customerAccountCurrency;
        this.customerAccountPIN = customerAccountPIN;
        this.customerAccountStatus = customerAccountStatus;
    }

    public String getCustomerAccountId() {
        return customerAccountId;
    }

    public Account setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
        return null;
    }

    public String getCustomerAccountName() {
        return customerAccountName;
    }

    public void setCustomerAccountName(String customerAccountName) {
        this.customerAccountName = customerAccountName;
    }

    public String getCustomerAccountBalance() {
        return customerAccountBalance;
    }

    public void setCustomerAccountBalance(String customerAccountBalance) {
        this.customerAccountBalance = customerAccountBalance;
    }

    public String getCustomerAccountCurrency() {
        return customerAccountCurrency;
    }

    public void setCustomerAccountCurrency(String customerAccountCurrency) {
        this.customerAccountCurrency = customerAccountCurrency;
    }

    public String getCustomerAccountPIN() {
        return customerAccountPIN;
    }

    public void setCustomerAccountPIN(String customerAccountPIN) {
        this.customerAccountPIN = customerAccountPIN;
    }

    public String getCustomerAccountStatus() {
        return customerAccountStatus;
    }

    public void setCustomerAccountStatus(String customerAccountStatus) {
        this.customerAccountStatus = customerAccountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (customerAccountId != null ? !customerAccountId.equals(account.customerAccountId) : account.customerAccountId != null)
            return false;
        if (customerAccountName != null ? !customerAccountName.equals(account.customerAccountName) : account.customerAccountName != null)
            return false;
        if (customerAccountBalance != null ? !customerAccountBalance.equals(account.customerAccountBalance) : account.customerAccountBalance != null)
            return false;
        if (customerAccountCurrency != null ? !customerAccountCurrency.equals(account.customerAccountCurrency) : account.customerAccountCurrency != null)
            return false;
        if (customerAccountPIN != null ? !customerAccountPIN.equals(account.customerAccountPIN) : account.customerAccountPIN != null)
            return false;
        return customerAccountStatus != null ? customerAccountStatus.equals(account.customerAccountStatus) : account.customerAccountStatus == null;
    }

    @Override
    public int hashCode() {
        int result = customerAccountId != null ? customerAccountId.hashCode() : 0;
        result = 31 * result + (customerAccountName != null ? customerAccountName.hashCode() : 0);
        result = 31 * result + (customerAccountBalance != null ? customerAccountBalance.hashCode() : 0);
        result = 31 * result + (customerAccountCurrency != null ? customerAccountCurrency.hashCode() : 0);
        result = 31 * result + (customerAccountPIN != null ? customerAccountPIN.hashCode() : 0);
        result = 31 * result + (customerAccountStatus != null ? customerAccountStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account" +
                "\ncustomerAccountId='" + customerAccountId + '\'' +
                "\ncustomerAccountName='" + customerAccountName + '\'' +
                "\ncustomerAccountBalance=" + customerAccountBalance +
                "\ncustomerAccountCurrency='" + customerAccountCurrency + '\'' +
                "\ncustomerAccountPIN=" + customerAccountPIN +
                "\ncustomerAccountStatus='" + customerAccountStatus + '\'';
    }
}
