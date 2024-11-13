import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Colors {

    public static void main(String[] args) {
    	
        System.out.println(color());
    }
    
    // Funcio que retorna un color random de l'arxiu
    private static String color() {
        Random random = new Random();
        String[] lineaColor = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("8.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaColor.length) {
                	lineaColor[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorno un color random
        if (lineaColor.length > 0) {
            return lineaColor[random.nextInt(lineaColor.length)];
        }
        return null;
    }
}
