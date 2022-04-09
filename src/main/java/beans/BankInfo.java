package beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "bankInfo", propOrder = {"bankName", "bankId", "bankWebAddress"})
public class BankInfo {

    String bankName;
    String bankId;
    String bankWebAddress;

    public BankInfo() {
    }

    public BankInfo(String bankName, String bankId, String bankWebAddress) {
        this.bankName = bankName;
        this.bankId = bankId;
        this.bankWebAddress = bankWebAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankWebAddress() {
        return bankWebAddress;
    }

    public void setBankWebAddress(String bankWebAddress) {
        this.bankWebAddress = bankWebAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankInfo bankInfo = (BankInfo) o;

        if (bankName != null ? !bankName.equals(bankInfo.bankName) : bankInfo.bankName != null) return false;
        if (bankId != null ? !bankId.equals(bankInfo.bankId) : bankInfo.bankId != null) return false;
        return bankWebAddress != null ? bankWebAddress.equals(bankInfo.bankWebAddress) : bankInfo.bankWebAddress == null;
    }

    @Override
    public int hashCode() {
        int result = bankName != null ? bankName.hashCode() : 0;
        result = 31 * result + (bankId != null ? bankId.hashCode() : 0);
        result = 31 * result + (bankWebAddress != null ? bankWebAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BankInfo" +
                "\nbankName='" + bankName + '\'' +
                "\nbankId='" + bankId + '\'' +
                "\nbankWebAddress='" + bankWebAddress + '\'';
    }
}
