import java.util.Random;
import java.util.Scanner;

public class Funcio_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner(System.in);
		//Zona de variables
		int minim;
		int maxim;
		int decimals; 
		double resultatDouble;
		
		System.out.println("Entri siusplau quin numero enter minim vol generar a partir ");
		minim=teclat.nextInt();
		
		System.out.println("Entri siusplau quin numero enter maxim vol generar");
		maxim=teclat.nextInt();
		

		System.out.print("Ingresa la cantidad de decimales: ");
		decimals=teclat.nextInt();
		
		resultatDouble=numInt(minim, maxim, decimals);
		 
		System.out.println(resultatDouble);

	}
	
	public static Double numInt (int minim, int maxim, int decimals) {
		Random bombo=new Random(maxim);
		
		
		// Generar un número aleatori amb decimals dins del rang
        double numAleatorio =0;
        numAleatorio = minim + (maxim - minim) * bombo.nextDouble();

        // Redondeja el número a la cantitat de decimals especificada
        double factor = Math.pow(10, decimals);  // Factor per moure els decimals 
        double numero = Math.round(numAleatorio * factor) / factor;
		
		
		return numero;	
	}
	
	

}
