import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Companyies {

    public static void main(String[] args) {
    	
        System.out.println(companyia());
    }
    
    // Function that returns a random company name from the file
    private static String companyia() {
        Random random = new Random();
        String[] lineaCompanyia = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("10.txt"))) {
            String temporal;
            int cont = 0;

            // Read lines and store in array

            while ((temporal = br.readLine()) != null) {
                if (cont < lineaCompanyia.length) {
                    lineaCompanyia[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Return a random company name
        if (lineaCompanyia.length > 0) {
            return lineaCompanyia[random.nextInt(lineaCompanyia.length)];
        }
        return null;  // If no companies were loaded
    }
}
