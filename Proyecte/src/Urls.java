import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Urls {

    public static void main(String[] args) {
    	
        System.out.println(url());
    }
    
    // Funcio que retorna una url random de l'arxiu
    private static String url() {
        Random random = new Random();
        String[] lineaUrl = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("9.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaUrl.length) {
                    lineaUrl[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorno una url random
        if (lineaUrl.length > 0) {
            return lineaUrl[random.nextInt(lineaUrl.length)];
        }
        return null;
    }
}
