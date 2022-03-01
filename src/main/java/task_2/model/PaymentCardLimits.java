package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "PaymentCardLimits")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentCardLimits {
    @XmlElement(name = "limits")
    private List<SecondLimits> secondLimits =new ArrayList<SecondLimits>();
    public List<SecondLimits> getSecondLimits() {
        return secondLimits;
    }

    public void setSecondLimits(List<SecondLimits> secondLimits) {
        this.secondLimits = secondLimits;
    }

    @Override
    public String toString() {
        return "limits: "+ secondLimits + "\r";
    }
}
