package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "limits")
@XmlAccessorType(XmlAccessType.FIELD)
public class SecondLimits {
    @XmlElement(name = "PaymentCardLimit")
    private PaymentCardLimit paymentCardLimit;
    @XmlElement(name = "PaymentCardLimit")
    private SecondPaymentCardLimit secondPaymentCardLimit;

    public PaymentCardLimit getPaymentCardLimit() {
        return paymentCardLimit;
    }
    public void setPaymentCardLimit(PaymentCardLimit paymentCardLimit) {
        this.paymentCardLimit = paymentCardLimit;
    }

    public SecondPaymentCardLimit getSecondPaymentCardLimit() {
        return secondPaymentCardLimit;
    }
    public void setSecondPaymentCardLimit(SecondPaymentCardLimit secondPaymentCardLimit) {
        this.secondPaymentCardLimit = secondPaymentCardLimit;
    }
    @Override
    public String toString() {
        return "PaymentCardLimit: "+ paymentCardLimit + "\r"+"PaymentCardLimit: "+ secondPaymentCardLimit + "\r";
    }
}
