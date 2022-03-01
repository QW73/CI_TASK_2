package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    @XmlElement(name = "PaymentCard")
    private List<PaymentCard> paymentCards =new ArrayList<PaymentCard>();
    public List<PaymentCard> getPaymentCards() {
        return paymentCards;
    }
    public void setPaymentCards(List<PaymentCard> paymentCards) {
        this.paymentCards = paymentCards;
    }

    @Override
    public String toString() {
        return "PaymentCard: "+ paymentCards + "\r";
    }
}
