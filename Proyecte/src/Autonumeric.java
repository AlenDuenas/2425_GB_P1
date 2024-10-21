import java.util.Scanner;
public class Autonumeric {
 
	public static void main(String[] args) {
	}
	public void autonumeric(int numLineas) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Autonumeric: Introduce 0 para el valor predeterminado");
		 int numI = teclado.nextInt();
		 if (numI == 0) { numI = 1;}
		 int []a  = new int[numLineas];
		 for(int i = 0; i < numLineas; i++) {
			 a[i] = numI;
			 numI++;
			 System.out.println(a[i]);
		 }
	}
	}

