package task_2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PaymentCardResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentCardResponse {
    @XmlElement(name = "head")
    private Head head;
    @XmlElement(name = "head")
    private Body body;

    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return "body: "+ body + "\r"+"head: "+ head + "\r";
    }
}
