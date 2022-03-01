package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "head")
@XmlAccessorType(XmlAccessType.FIELD)
public class Head {
    @XmlElement(name = "branchId")
    private String branchId;
    @XmlElement(name = "customerId")
    private String customerId;
    @XmlElement(name = "result")
    private String result;
    @XmlElement(name = "subSys")
    private String subSys;

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    public String getSubSys() {
        return subSys;
    }
    public void setSubSys(String subSys) {
        this.subSys = subSys;
    }

    @Override
    public String toString() {
        return "branchId: "+ branchId + "\r"+ "customerId: "+ customerId + "\r"+"result: "+ result + "\r"+"subSys: "+ subSys + "\r";
    }
}
