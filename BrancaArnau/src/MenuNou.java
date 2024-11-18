import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MenuNou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		
		
		String [] lectura = OpcionsCamp0 (teclat);	//Opcions de l'arxiu d'entrada
		
		funcions (lectura);
		
		/*for (int i=0;i<opcions.length;i++)
		{
			System.out.println(opcions[i]);
		}*/
		
	
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
	
		 


	
	public static void funcions (String [] lectura) {
		int opcio=0;
        String separo[];
        boolean compleix = true;
        boolean errors = false;
		  try {   
		
			  
			  

			 // liniaI ();
		      
				for (int i=0; i < lectura.length; i++)
				{
					//Seprem la linia sensera per el seu separador #
					separo = lectura[i].split("#");
					compleix=true;
					if (esNumero(separo[0]))//Comprovo que el primer camp de la linia sigui un numero
					{
						//Ara anem a fer les comprovacions adiens per veure si cumpleix cada camp 
						if (Integer.parseInt(separo[0]) > 0 && Integer.parseInt(separo[0]) < 10)	//Començem comprovar els camp del 1 al 10
						{
							if (separo.length!=2)	//Si el camp senser te mes camps del que toca error 
							{
								System.out.println("Error en la linia "+i);
								compleix=false;
							}
							
							else if (separo[0] == null || separo [1] == null)	//Si un dels dos camps es null error
							{
								System.out.println("Error en la linia "+i);
								compleix=false;
							}

							
						}
						
						if (Integer.parseInt(separo[0])>10 && Integer.parseInt(separo[0])<20)
						{
							
							
							if (separo[0] == null || separo [1] == null)	//Si un dels dos camps es null error
							{
								System.out.println("Error en la linia "+i + " camps buits");
								compleix=false;
								
							}
							
							else if (separo.length !=  2 && separo.length != 3 )
							{
								System.out.println("Error en la linia "+i + " nº camps incorrecte");
								compleix=false;
							}
							
						}
						
					}
					
					else 
					{
						System.out.println("ERROR hi ha una lletra ");
					}
					
					
					
					
				if (compleix)
				{
					switch (Integer.parseInt(separo[0])) {
					case 1:	
				 	    System.out.println("Ha triat la funcio 1");
			 	    break;
			 	    case 2:
			 	    	 System.out.println("Ha triat la funcio 2");
			 	    break;
			 	    case 3:	
			 	    	 System.out.println("Ha triat la funcio 3"); 
			 	    break;
			 	    case 4:
			 	    	 System.out.println("Ha triat la funcio 4");
			 	    break;
			 	    case 5:
			 	    	 System.out.println("Ha triat la funcio 5");
			 	    break;
			 	    case 6:
			 	    	 System.out.println("Ha triat la funcio 6");
			 	    break;
			 	    case 7:
			 	    	 System.out.println("Ha triat la funcio 7");
			 	    break;	
			 	    case 8:
			 	    	 System.out.println("Ha triat la funcio 8");
			 	    break;
			 	    case 9:
			 	    	 System.out.println("Ha triat la funcio 9");
			 	    break;
			 	    case 10:
			 	    	 System.out.println("Ha triat la funcio 10");
			 	    break;
			 	    case 11:
			 	    	 System.out.println("Ha triat la funcio 11");
				 	break;
			 	    case 12:
			 	    	 System.out.println("Ha triat la funcio 12");
			 	    	 
			 	    	 String coma[];
			 	    	
			 	    	 
			 	    	 coma=separo[2].split(",");			 	    	
			 	    	 int valor1=Integer.parseInt(coma[0]);
			 	    	 int valor2=Integer.parseInt(coma[1]);;
			 	    	 int valor3=Integer.parseInt(coma[2]);;
			 	    	 
			 	    	 
			 	    	 
			 	    	 
			 	    	 
			 	    	 
			 	    	 
			 	    break;
			 	    case 13:
			 	    	 System.out.println("Ha triat la funcio 13");	    
			 	    break;
			 	    case 14:
			 	    	 System.out.println("Ha triat la funcio 14");
			 	    break;
			 	    case 15:
			 	    	 System.out.println("Ha triat la funcio 15");
			 	    break;
			 	    case 16:
			 	    	 System.out.println("Ha triat la funcio 16");
			 	    break;
			 	    case 17:
			 	    	 System.out.println("Ha triat la funcio 17");
			 		break;
			 	    case 18:
			 	    	 System.out.println("Ha triat la funcio 18");
			 	    break;
			 	    case 19:
			 	    	 System.out.println("Ha triat la funcio 19");
			 	    break;	
			 	    default:
			 	    	System.out.println("opcio no valida");
			 	    	
			 	    	break;

					}
					
				} 
				if(!compleix) 
				{
					  errors =true;
				}
				
			}
			if(errors) 
			{
				  System.out.println("L'arxiu d'entrada te ERRORS");
			}
		
			
			
		}catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		

	}
	
	public static  boolean esNumero (String  numero) {
		
		 try {
       	
			 Double.parseDouble(numero);
			 return true;
   		
   		
		        
		      
		 }catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
			return false;
		 }
} 
	

	
	public static void liniaI (String [] linia) {
	
		
		
		 /*try {
	       	
	   		
	   		
	   		 int i=0;
	   		
	       	File arxiu = new File("C:\\Users\\arnau\\Desktop\\Mo.txt");
	   		
	   	    BufferedReader lector = new BufferedReader(new FileReader(arxiu));
	        
	           
	           
	           lector.readLine();	//Passo de la primera linia 
	           
	         String linies [] =null;  
	          
			while ((linies[i] = lector.readLine()) != null) 
			      {
		    		
	        	   
	           	
			    	
			      }   lector.close();
			        
			      
		 }catch (Exception pasanCosas) {
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
	
	public static String [] OpcionsCamp0 (Scanner teclat) {
		int cont=0;
		
		//int i=0;
		String primeraLinea="";
		int k=0;
		String [] camps= null;
		
		
		try {
		
		File arxiu = new File("C:\\Users\\arnau\\Desktop\\Mo.txt");
		
		  BufferedReader lector = new BufferedReader(new FileReader(arxiu));
	      String linea="";
	      primeraLinea=lector.readLine();
	      
	      
	      
	    boolean compleix = comprovacioPrimeraLinia(primeraLinea);
	      
	      //Condicio de que si la primera linia no es correcte no entro a llegir les altres linies
	    if (compleix)
	    {
	    	
	    	 while ((lector.readLine()) != null) //Per poder processar la informació la pàsso a l'String linea per mes endavant dividir-la
		      {
	    		
		    	
		    	  cont++;
		    	 
		      }   lector.close();
		      
		      
		      
		      //
		      BufferedReader lector2 = new BufferedReader(new FileReader(arxiu));
		      
		      String guardo [] = new String [cont];
		      
		      linea=lector2.readLine();
		      while ((linea = lector2.readLine()) != null) //Per poder processar la informació la pàsso a l'String linea per mes endavant dividir-la
		      {
	    		
		    	  //System.out.println(linea);
		    	 //System.out.println(guardo[k]);
			    	  //camps=linea.split("#");
			    	  guardo[k] = linea;	//Guardo totes les linies en un array per despres, més endavant tractar-les
			    	  k++;
			    	//System.out.println(camps[0]); 
			    	 
		    	 
		      } lector2.close();
		      

		     
		      
		      //k=0;   
		      //boolean surt[] = comprovoCamps0(camps[0], cont) ; 
		      //String opcions[] = arxiuSeleccio();//Noms dels arxius  
		      return guardo;
	    }
	    
	    else 
	    {
	    	System.out.println("No compleix");
	    	return null;
	    }
	   
	     
	   
	}catch (Exception pasanCosas) {
		pasanCosas.printStackTrace();
	}
		return null;
		
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
	
	/*public static boolean[] comprovoCamps0(String  valors, int longitut) {
		boolean compleix[] = new boolean [longitut] ;
		int numero = Integer.parseInt(valors);
		for (int i=0; i<longitut; i++)
		{
			if (numero < 1 && numero > 19)
			{
				compleix[i] = false;
			}
			
			else 
			{
				compleix[i]=true;
			}			
		}
		return compleix;
		
	}*/
	
	
	
	
	
	
	/*public static String [] arxiuSeleccio () {
		
		File ruta = new File ("C:\\Users\\arnau\\Documents\\ArxiusProjecte");
		File [] arxius = ruta.listFiles();
		
		String separo[]=null;
		String opcions[]= new String [20];
		
		for (int i=0;i<arxius.length;i++)
		{
			separo=arxius[i].getName().split("\\.");	//Separem els arxius per . per a que no agafi l'extensio
			//System.out.println(separo[0]);
			opcions[i]=separo[0];
			//System.out.println(opcions[i]);
		}
		
		return opcions;
		
		
	}*/
	
	
	
	
}
