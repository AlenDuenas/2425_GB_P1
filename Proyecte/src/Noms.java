import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Noms {

    public static void main(String[] args) {
    	
        System.out.println(nom());
    }
    // Funcio que retorna un nom random de l'arxiu
    private static String nom() {
        Random random = new Random();
        String[] lineaNom = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("1.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaNom.length) {
                	lineaNom[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorno un nom random
        if (lineaNom.length > 0) {
            return lineaNom[random.nextInt(lineaNom.length)];
        }
        return null; 
    }
}
