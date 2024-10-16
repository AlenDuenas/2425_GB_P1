import java.util.Scanner;
public class Autonumeric {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 int numI = teclado.nextInt();
		 int numLineas = 100;
		 int []a  = new int[numLineas];
		 for(int i = 0; i < numLineas; i++) {
			 a[i] = numI;
			 numI++;
		 }

	}

}
