import java.util.Random;
import java.util.Scanner;

public class Funcio_dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner(System.in);
		
		//Zona de variables 
		int [] resultat;
		int data;
		//Zona de codi 
		resultat=valorsInicials(teclat);
		
		data=numAleatori(resultat);
		  
		System.out.println(data);
		
	}
	
	public static int[] valorsInicials(Scanner teclat) {
 		int resultat[]=new int[2];
		int min;
		int max;
		boolean condicio=true;
		
		
		while (condicio)
		{
		    System.out.println("Indica siusplau una data minima i maxima per generar --> ");
		    System.out.println("Els valors per defecte son: MINIM: 1900 I MAXIM 2023");
		    System.out.println("Entri siusplau una data minima, si no vol entrar-ne cap entri un 0");
		    min = teclat.nextInt();

		    System.out.println("Entri siusplau una data maxima, si no vol entrar-ne cap entri un 1");
		    max = teclat.nextInt();

		    // Validar i assignar valor per defecte si s'introdueixen 0 o 1
		    if (min == 0) 
			    {
			        resultat[0] = 1900; // Valor per defecte
			    } 
			    
		    
		    else if (min >= 1900 && min <= 2023) 
			    {
			        resultat[0] = min;  // Valor validat
			    } 
		    
		    
		    	else 
			    {
			        System.out.println("La data minima no és vàlida, ha de ser entre 1900 i 2023.");
			        continue; // Torna a demanar les dates
			    }

		    if (max == 1) 
		    
			    {
			        resultat[1] = 2023; // Valor per defecte
			    } 
			    
		    
		    else if (max >= 1900 && max <= 2023 && max >= resultat[0])
		    
			    {
			        resultat[1] = max;  // Valor validat
			    } 
			    
		    
		    else 
		    
			    {
			        System.out.println("La data màxima no és vàlida, ha de ser entre 1900 i 2023 i no pot ser inferior a la data mínima.");
			        continue; // Torna a demanar les dates
			    }

		    // Si s'arriba aquí, les dates són vàlides i es surt del bucle
		    	condicio = false;
		}
		
		
		
		
		
		System.out.println("Els valors son: ANY MINIM "+resultat[0]+" i ANY MAXIM "+resultat[1]);
		
		
		return resultat;
	}
	

	public static int numAleatori(int[] valors) {
		Random bombo=new Random(valors[1]);
		int num=0;
		boolean condicio=true;
		
		
		
		num=bombo.nextInt();
		num=num+valors[0];
		
		while (condicio)
		{
			if (num<valors[0] || num>valors[1])
			{
				num=bombo.nextInt();
				num=num+valors[0];

			}
			else 
			{
				condicio=false;
			}
		}

		
		return num;
		
		
		
	}

}
