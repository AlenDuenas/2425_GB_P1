import java.util.Scanner;
public class Autonumeric {
 
	public static void main(String[] args) {
	}
	
	/**
	 * Aquesta funcio conta desde un numero 
	 * @param numLineas
	 * numLineas es la quantitat de numeros a contar
	 */
	public void autonumeric(int numLineas) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Autonumeric: Introdueix 0 pel valor predeterminat");
		 int numI = teclado.nextInt();
		 if (numI == 0) { numI = 1;}
		 int []a  = new int[numLineas];
		 for(int i = 0; i < numLineas; i++) {
			 a[i] = numI;
			 numI++;
		 }
	}
	}

