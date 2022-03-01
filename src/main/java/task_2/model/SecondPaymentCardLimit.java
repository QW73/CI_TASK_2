package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PaymentCardLimit")
@XmlAccessorType(XmlAccessType.FIELD)
public class SecondPaymentCardLimit {
    @XmlElement(name = "amountMax")
    private String amountMax;
    @XmlElement(name = "limitTypeId")
    private String limitTypeId;
    @XmlElement(name = "rest")
    private String rest;
    @XmlElement(name = "summ")
    private String summ;

    public String getAmountMax() {
        return amountMax;
    }
    public void setAmountMax(String amountMax) {
        this.amountMax = amountMax;
    }

    public String getLimitTypeId() {
        return limitTypeId;
    }
    public void setLimitTypeId(String limitTypeId) {
        this.limitTypeId= limitTypeId;
    }

    public String getRest() {
        return rest;
    }
    public void setRest(String rest) {
        this.rest = rest;
    }

    public String getSumm() {
        return summ;
    }
    public void setSumm(String summ) {
        this.summ = summ;
    }

    @Override
    public String toString() {
        return "amountMax: "+ amountMax + "\r"+"limitTypeId: "+ limitTypeId + "\r"+
                "rest: "+ rest + "\r"+"summ: "+ summ + "\r";
    }
}
