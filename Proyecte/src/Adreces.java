import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Adreces {

    public static void main(String[] args) {
    	
        System.out.println(adreça());
    }
    
    // Funcio que retorna una adreça random de l'arxiu
    private static String adreça() {
        Random random = new Random();
        String[] lineaAdreça = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("4.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaAdreça.length) {
                	lineaAdreça[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorno una adreça random
        if (lineaAdreça.length > 0) {
            return lineaAdreça[random.nextInt(lineaAdreça.length)];
        }
        return null;  
    }
}