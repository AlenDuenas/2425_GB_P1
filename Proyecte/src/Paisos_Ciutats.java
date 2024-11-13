import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Paisos_Ciutats {

	public static void main(String[] args) {

		System.out.println(ciutat());
	}

	// Funcio que retorna una ciutat random de l'arxiu
	private static String ciutat() {
		Random random = new Random();
		String[] lineaCiutat = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("3 i 6.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaCiutat.length) {
					lineaCiutat[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno una ciutat random
		if (lineaCiutat.length > 0) {
			return lineaCiutat[random.nextInt(lineaCiutat.length)];
		}
		return null;  
	}
}