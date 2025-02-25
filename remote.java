import java.net.*;

public class remote {
    public static void main(String args[]) {
        try {
            // Fetch the IP address of the given domain
            InetAddress ip = InetAddress.getByName("www.onlinekhabar.com");
            
            // Display the IP address of the specified host
            System.out.println("IP of this system = " + ip.getHostAddress());
        } 
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
