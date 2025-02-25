import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ContentGetter {
    public static void main(String[] args) {
        String location = "http://www.spm.com.np";
        String location1 = "https://1.bp.blogspot.com/-zkviyYzoTM/X2qu9IfpwwI/AAAAAAAZA/EFKhh9Y9AZE8WWt7TkjhqMM8YOCLcBGasYhQ/w640-h394/net/netbean%2Bargument.PNG";

        try {
            URL url = new URL(location1);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading content: " + e.getMessage());
        }
    }
}
