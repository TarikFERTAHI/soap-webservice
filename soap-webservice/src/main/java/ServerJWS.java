import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new BanqueService());
        System.out.println("web service deployé sur http://0.0.0.0:9191/ ");
    }
}
