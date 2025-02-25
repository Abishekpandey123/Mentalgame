import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URL_EXAMPLE {
    public static void main(String args[]) {
        try {
            String location = "https://lolcats.com/";
            URL url = new URL(location);  // Fixed variable name (Location -> location)

            // Open URL stream and wrap it in a BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = br.readLine()) != null) {  // Fixed space in `!= null`
                System.out.print(line);  // Print each line
            }

            br.close();  // Close the BufferedReader

        } catch (IOException ex) {
            System.out.print(ex);  // Print exception if any
        }
    }
}
