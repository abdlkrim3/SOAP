import jakarta.xml.ws.Endpoint;
import service.BankService;

public class SOAPWebService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:5050/", new BankService());
    }
}


