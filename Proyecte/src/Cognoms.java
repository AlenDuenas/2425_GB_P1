import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Cognoms {

	public static void main(String[] args) {

		System.out.println(cognom());
	}

	// Funcio que retorna un cognom random de l'arxiu
	private static String cognom() {
		Random random = new Random();
		String[] lineaCognom = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("2.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaCognom.length) {
					lineaCognom[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno un cognom random
		if (lineaCognom.length > 0) {
			return lineaCognom[random.nextInt(lineaCognom.length)];
		}
		return null;  
	}
}
