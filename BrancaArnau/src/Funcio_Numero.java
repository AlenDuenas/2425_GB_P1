import java.util.Random;
import java.util.Scanner;

public class Funcio_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner(System.in);
		//Zona de variables
		int minim;
		int maxim;
		 
		double resultatDouble;
		
		System.out.println("Entri siusplau quin numero enter minim vol generar a partir ");
		minim=teclat.nextInt();
		
		System.out.println("Entri siusplau quin numero enter maxim vol generar");
		maxim=teclat.nextInt();
		
		resultatDouble=numInt(minim, maxim);
		System.out.println(resultatDouble);

	}
	
	public static Double numInt (int minim, int maxim) {
		Random bombo=new Random(maxim);
		double num=0;
		boolean condicio=true;
		num=bombo.nextInt();
		num=num+minim;
		
		
		
		while (condicio)
		{
			if (num<minim || num>maxim)
			{
				num=bombo.nextInt();
				num=num+minim;

			}
			else 
			{
				condicio=false;
			}
		}
		

		return num;	
	}
	
	

}
