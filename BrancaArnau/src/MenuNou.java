import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MenuNou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		
		opcions(teclat);
		
		
		
	
		/*try {		

			//Tipus de file fileReader per llegir-lo 
			FileReader fr = new FileReader("C:\\Users\\arnau\\Desktop\\Mo.txt"); //Posem ruta d'arxiu per llegir
			BufferedReader br = new BufferedReader(fr); 	//Serveix per llegir 
			
			
		while(br.ready()) 
		{ 		
			
			
		}
		
		br.close();			
		fr.close();
		
		
		
		
		
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		*/
	}

	
	public static String  primeraLinia () {
		 String linea="";
		
		try {
			File arxiu = new File("C:\\Users\\arnau\\Desktop\\Mo.txt");
			
		  BufferedReader lector = new BufferedReader(new FileReader(arxiu));
	       
	       linea = lector.readLine();
			
	     
	   
	        
	        lector.close();
	    
			
		}catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		return linea;
	}
	
	public static void  opcions (Scanner teclat) {
		int cont=0;
		String guardo [] = new String [20] ;
		//int i=0;
		String primeraLinea="";
		
		try {
		
		File arxiu = new File("C:\\Users\\arnau\\Desktop\\Mo.txt");
		
		  BufferedReader lector = new BufferedReader(new FileReader(arxiu));
	      String linea="";
	      primeraLinea=lector.readLine();
	      
	    boolean compleix = comprovacioPrimeraLinia(primeraLinea);
	      
	      //Condicio de que si la primera linia no es correcte no entro a llegir les altres linies
	    if (compleix)
	    {
	    	 String arxius[] =  arxiuSeleccio();
	    	 while ((linea=lector.readLine()) != null) //Per poder processar la informació la pàsso a l'String linea per mes endavant dividir-la
		      {
		    	 
	       		//System.out.println(linea);
		    	  
		    	  String [] camps=linea.split("#");   	  
		    	  
		    	 // System.out.println(camps[0]); 
		    	
		    	  
		    	  
		      }

	    	 
	        lector.close();
	        
	        
	        
		 
			
		    
			
	    }
	    
	    else 
	    {
	    	System.out.println("No compleix");
	    }
	     
		}catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
	}
	
	
	public static boolean comprovacioPrimeraLinia (String primeraLinia) {
		String [] separo = primeraLinia.split("#");
		boolean compleix = true;
		int registres=Integer.parseInt(separo[2]);
		
		for (int i = 0; i < separo.length; i++)
		{
			
			if (!separo[0].equals("XML") && !separo[0].equals("SQL"))
			{
				compleix = false;
				
			}
			
			else if (separo[1].charAt(0) != 'c' && separo[1].charAt(0) != 'C' || separo[1].charAt(1) != ':' || separo[1].charAt(2) != '\\')
			{
				compleix = false;
				
			}
			
			try {
		        if (registres < 1 || registres > 1000) {
		            return false; // Número de registros fora de rang
		        }
		    } catch (NumberFormatException e) {
		        return false; // Error al convertir a entero, formato inválido
		    }
			
		}
		return compleix;
	} 
	
	
	
	public static String[] arxiuSeleccio () {
		
		File ruta = new File ("C:\\Users\\arnau\\Documents\\ArxiusProjecte");
		File [] arxius = ruta.listFiles();
		String separo[]=null;
		
		
		for (int i=0;i<arxius.length;i++)
		{
			separo=arxius[i].getName().split("\\.");	//Separem els arxius per . per a que no agafi l'extensio
			//System.out.println(separo[0]);
		}
		
		return separo;
		
		
	}
	
	
	
	
}
