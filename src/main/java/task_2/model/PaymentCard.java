package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PaymentCard")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentCard {
    @XmlElement(name = "account")
    private String account;
    @XmlElement(name = "balance")
    private String balance;
    @XmlElement(name = "blocking")
    private String blocking;
    @XmlElement(name = "cardNumber")
    private String cardNumber;
    @XmlElement(name = "cardNumberMask")
    private String cardNumberMask;
    @XmlElement(name = "cardholderName")
    private String cardholderName;
    @XmlElement(name = "designId")
    private String designId;
    @XmlElement(name = "embossedName")
    private String embossedName;
    @XmlElement(name = "expirationDate")
    private String expirationDate;
    @XmlElement(name = "limits")
    private Limits limits;

    //4
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBlocking() {
        return blocking;
    }
    public void setBlocking(String blocking) {
        this.blocking = blocking;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    //8

    public String getCardNumberMask() {
        return cardNumberMask;
    }
    public void setCardNumberMask(String cardNumberMask) {
        this.cardNumberMask = cardNumberMask;
    }

    public String getCardholderName() {
        return cardholderName;
    }
    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getDesignId() {
        return designId;
    }
    public void setDesignId(String designId) {
        this.designId = designId;
    }

    public String getEmbossedName() {
        return embossedName;
    }
    public void setEmbossedName(String embossedName) {
        this.embossedName= embossedName;
    }

    //10

    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate= expirationDate;
    }

    public Limits getLimits() {
        return limits;
    }
    public void setLimits(Limits limits) {
        this.limits= limits;
    }

    @Override
    public String toString() {
        return "account: "+ account + "\r"+
                "balance: "+ balance + "\r"+
                "blocking: "+ blocking+ "\r"+
                "cardNumber: "+ cardNumber + "\r"+
                "cardNumberMask: "+ cardNumberMask + "\r"+
                "cardholderName: "+ cardholderName + "\r"+
                "designId: "+ designId + "\r"+
                "embossedName: "+ embossedName + "\r"+
                "expirationDate: "+ expirationDate + "\r"+
                "limits: "+ limits + "\r";
    }
}
