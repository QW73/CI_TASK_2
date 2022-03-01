package task_2;

import task_2.model.PaymentCard;
import task_2.model.PaymentCardResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by arif on 8/11/2017.
 */
public class Main {
    public static void main(String[] agrs) {
        Reader();
        try {
            PaymentCardResponse paymentCardResponse = unmarshalling();
            System.out.println(paymentCardResponse.toString());
            marshalling(paymentCardResponse);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void marshalling(PaymentCardResponse paymentCardResponse) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(PaymentCardResponse.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(paymentCardResponse, System.out);
    }

    private static PaymentCardResponse unmarshalling() throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(PaymentCardResponse.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        File file = new File("src/main/resources/source");
        PaymentCardResponse paymentCardResponse= (PaymentCardResponse) unmarshaller.unmarshal(file);

        if(paymentCardResponse != null) {
            System.out.println("Unmarshalling successful!");
        }

        return paymentCardResponse;
    }

    private static void Reader () {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader BR = new BufferedReader(new FileReader("src/main/resources/source"));
            for (; ; ) {
                String line = BR.readLine();
                if (line == null) {
                    break;
                }
                builder.append(line + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}