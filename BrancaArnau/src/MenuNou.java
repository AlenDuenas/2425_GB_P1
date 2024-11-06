import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MenuNou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		
		String primeraLinia= primeraLinia();	//Aqui guardo la primera linea del arxiu per mes endavant configurar l'arxiu
		
		
		
		
		
		String opcions [] =opcions(teclat);
		
		for (int i=0;i<opcions.length&&opcions[i]!=null;i++)
		{
			System.out.println(opcions[i]);
		}
		
		

		
		
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
	
	public static String []  opcions (Scanner teclat) {
		int cont=0;
		String guardo [] = new String [20] ;
		int i=0;
		try {
		
		File arxiu = new File("C:\\Users\\arnau\\Desktop\\Mo.txt");
		
		  BufferedReader lector = new BufferedReader(new FileReader(arxiu));
	      String linea="";
	      
	    
	      while ((linea = lector.readLine()) != null) 
	      {
	    	  if (cont >= 1) 
	    	  {
	           	
	            guardo[i]=linea;
	            i++;
	            
	    	  }
	    	 
	    	  cont++;
	      }

        lector.close();
	    return guardo;
			
		}catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		return null;
	}
	
	
	public static void separacio () {
		
	}
	
	
	
}
