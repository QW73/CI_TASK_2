package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "limits")
@XmlAccessorType(XmlAccessType.FIELD)
public class Limits {
    @XmlElement(name = "PaymentCardLimits")
    private List<PaymentCardLimits> paymentCardLimits =new ArrayList<PaymentCardLimits>();
    public List<PaymentCardLimits> getPaymentCardLimits() {
        return paymentCardLimits;
    }

    public void setPaymentCardLimits(List<PaymentCardLimits> paymentCardLimits) {
        this.paymentCardLimits = paymentCardLimits;
    }
    @Override
    public String toString() {
        return "PaymentCardLimits"+ paymentCardLimits + "\r";
    }
}
