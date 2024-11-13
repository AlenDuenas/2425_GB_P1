import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Estudis {

    public static void main(String[] args) {
    	
        System.out.println(estudi());
    }
    
    // Funcio que retorna un estudi random de l'arxiu
    private static String estudi() {
        Random random = new Random();
        String[] lineaEstudi = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("7.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaEstudi.length) {
                	lineaEstudi[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorno un estudi random
        if (lineaEstudi.length > 0) {
            return lineaEstudi[random.nextInt(lineaEstudi.length)];
        }
        return null;
    }
}