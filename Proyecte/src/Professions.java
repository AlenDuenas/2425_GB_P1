import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Professions {

    public static void main(String[] args) {
    	
        System.out.println(professio());
    }
    
    // Funcio que retorna una professio random de l'arxiu
    private static String professio() {
        Random random = new Random();
        String[] lineaProfessio = new String[161];  
        try (BufferedReader br = new BufferedReader(new FileReader("5.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaProfessio.length) {
                	lineaProfessio[cont] = temporal;
                    cont++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorno una professio random
        if (lineaProfessio.length > 0) {
            return lineaProfessio[random.nextInt(lineaProfessio.length)];
        }
        return null;
    }
}
