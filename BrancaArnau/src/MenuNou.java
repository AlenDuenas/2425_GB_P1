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
	    
	      while ((linea=lector.readLine()) != null) //Per poder processar la informació la pàsso a l'String linea per mes endavant dividir-la
	      {
	    	 
       		//System.out.println(linea);
	    	  
	    	  String [] camps=linea.split("#");
	    	   	  
	    	  
	    	  System.out.println(camps[0]); 
	    
	      }

        lector.close();
	   
			
		}catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
