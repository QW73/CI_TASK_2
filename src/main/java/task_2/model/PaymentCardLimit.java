package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PaymentCardLimit")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentCardLimit {
    @XmlElement(name = "limitTypeId")
    private String limitTypeId;
    @XmlElement(name = "operationCount")
    private String operationCount;
    @XmlElement(name = "operationCountMax")
    private String operationCountMax;
    @XmlElement(name = "operationCountRest")
    private String operationCountRest;

    public String getLimitTypeId() {
        return limitTypeId;
    }
    public void setLimitTypeId(String limitTypeId) {
        this.limitTypeId = limitTypeId;
    }

    public String getOperationCount() {
        return operationCount;
    }
    public void setOperationCount(String operationCount) {
        this.operationCount= operationCount;
    }

    public String getOperationCountMax() {
        return operationCountMax;
    }
    public void setOperationCountMax(String operationCountMax) {
        this.operationCountMax = operationCountMax;
    }

    public String getOperationCountRest() {
        return operationCountRest;
    }
    public void setOperationCountRest(String operationCountRest) {
        this.operationCountRest = operationCountRest;
    }

    @Override
    public String toString() {
        return "limitTypeId: "+ limitTypeId + "\r"+
                "operationCount: "+ operationCount + "\r"+
                "operationCountMax: "+ operationCountMax+ "\r"+
                "operationCountRest : "+ operationCountRest  + "\r";
    }
}
