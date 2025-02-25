package Lab.Unit2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Reachability {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("www.google.com");
            System.out.println("Reachable: " + addr.isReachable(2000));
        } catch (UnknownHostException e) {
            System.out.println("Invalid host: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Network error: " + e.getMessage());
        }
    }
}
