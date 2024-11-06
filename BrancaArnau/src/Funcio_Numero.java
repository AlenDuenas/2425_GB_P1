import java.util.Random;
import java.util.Scanner;

public class Funcio_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner(System.in);
		//Zona de variables
		 
		double resultatDouble;
		int opcions[];
		
		opcions=opcions(teclat);
		
		
		resultatDouble=numInt(opcions[0], opcions[1], opcions[2]);
		 
		System.out.println(resultatDouble);

	}
	
	
	public static int [] opcions (Scanner teclat) {
		int minim;
		int maxim;
		int decimals;
		int opcio[]=new int[3];
		
		System.out.println("Entri siusplau quin numero enter minim vol generar a partir si posa un 0 el valor serà 0 ");
		minim=teclat.nextInt();
		
		if (minim==0)
		minim=0;
		
		System.out.println("Entri siusplau quin numero enter maxim vol generar si posa 0 el valor serà 1000");
		maxim=teclat.nextInt();
		
		if (maxim==0)
			maxim=1000;

		System.out.print("Entri la catitat de decimals que vol que tingui el numero ");
		decimals=teclat.nextInt();
		
		opcio[0]=minim;
		opcio[1]=maxim;
		opcio[2]=decimals;
		
		return opcio;
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
