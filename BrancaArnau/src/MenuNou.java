import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
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
					//Separem la linia sensera per el seu separador #
					separo = lectura[i].split("#");
					compleix=true;
					//System.out.println(separo[0]);
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
						compleix=false;
					}
					
					
					
					
				if (compleix)
				{
					switch (Integer.parseInt(separo[0])) {
					case 1:	
				 	    System.out.println("Ha triat la funcio 1 ");
			 	    break;
			 	    case 2:
			 	    	 System.out.println("Ha triat la funcio 2 ");
			 	    break;
			 	    case 3:	
			 	    	 System.out.println("Ha triat la funcio 3 "); 
			 	    break;
			 	    case 4:
			 	    	 System.out.println("Ha triat la funcio 4 ");
			 	    break;
			 	    case 5:
			 	    	 System.out.println("Ha triat la funcio 5 ");
			 	    break;
			 	    case 6:
			 	    	 System.out.println("Ha triat la funcio 6 ");
			 	    break;
			 	    case 7:
			 	    	 System.out.println("Ha triat la funcio 7 ");
			 	    break;	
			 	    case 8:
			 	    	 System.out.println("Ha triat la funcio 8 ");
			 	    break;
			 	    case 9:
			 	    	 System.out.println("Ha triat la funcio 9 ");
			 	    break;
			 	    case 10:
			 	    	 System.out.println("Ha triat la funcio 10 ");
			 	    break;
			 	    case 11:
			 	    	 System.out.println("Ha triat la funcio 11 ");
				 	break;
			 	    case 12:
			 	    	 System.out.println("Ha triat la funcio 12 ");
			 	    	 
			 	    	 
			 	    	 
			 	    	 String coma[];
			 	    	
			 	    	 			 	    	 
			 	    	 
			 	    	 coma=separo[2].split(",");			 	    		
			 	    		
			 	    	 int valor1=Integer.parseInt(coma[0]);
			 	    	 int valor2=Integer.parseInt(coma[1]);;
			 	    	 int valor3=Integer.parseInt(coma[2]);;
			 	    	 
			 	    	 
			 	    	 if (valor1<=15 && valor1>0 && valor2>0 && valor2<999 && valor3>0 && valor3<=1000)
			 	    	 {
			 	    		 double resultatDouble;
				 			 int opcions[];
				 			
				 			 opcions=opcions(valor1, valor2, valor3);
				 			
				 			
				 			 resultatDouble=numInt(opcions[0], opcions[1], opcions[2]);
				 			 
				 			 System.out.println("El numero es "+resultatDouble+"\n");
			 	    	 }
			 	    	 
			 	    	 						
			 	    	 
			 	    	 else 
			 	    	 {
			 	    		errors =true;
			 	    		
			 	    	 }	//System.out.println("Holaxx");

			 	    break;
			 	    case 13:
			 	    	 System.out.println("Ha triat la funcio 13 ");	    
			 	    break;
			 	    case 14:
			 	    	 System.out.println("Ha triat la funcio 14 ");
			 	    break;
			 	    case 15:
			 	    	 System.out.println("Ha triat la funcio 15 ");
			 	    	 
			 	    	 //System.out.println("Hola");
			 	    	 String opcionsContrasenya[];
			 	    	 
			 	    	 opcionsContrasenya=separo[2].split(",");
			 	    	 
			 	    	 int opContr1=Integer.parseInt(opcionsContrasenya[0]);
			 	    	 int opContr2=Integer.parseInt(opcionsContrasenya[1]);
			 	    	 int opContr3=Integer.parseInt(opcionsContrasenya[2]);
			 	    	 int opContr4=Integer.parseInt(opcionsContrasenya[3]);
			 	    	 int longitut=Integer.parseInt(opcionsContrasenya[4]);
			 	    	 
			 	    	 
			 	    	 //System.out.println(opcionsContrasenya[0]+opcionsContrasenya[1]+opcionsContrasenya[2]+opcionsContrasenya[3]+opcionsContrasenya[4]);
			 	    	if (opContr1==1 || opContr1==2 && opContr2==1 || opContr2==2 && opContr3==1 || opContr3==2 && opContr4==1 || opContr4==2 && longitut>3 )
			 	    	 {

			 	    		// System.out.println("Hola");
			 	    		//Zona de variables 
			 	    		int opcioContrasenya[];
			 	    		String contrasenyaLletres;
			 	    		String contrasenyaNumeros;
			 	    		String contrasenyaMajuscules;
			 	    		String contrasenyaSimbols;
			 	    		
			 	    		 
			 	    		//Imprimim el menu de benvinguda 
			 	    		menu();
			 	    		
			 	    		//Guardem totes les opcions rebudes enn un arrray desde el main 
			 	    		opcioContrasenya = opcions (opContr1, opContr2, opContr3, opContr4, longitut);
			 	    		
			 	    		//Guardem en una variable la longitut que ens han entrat per teclat
			 	    		int opcioLongitut = opcioContrasenya[4];
			 	    		
			 	    		
			 	    		//Si la opcio GenerarLletres es 2. No, aixi amb totes les condicions (Generar Numeros, Simbols, majuscules, minuscules...) 
			 	    		if (opcioContrasenya[0] == 2) 
			 	    		{
			 	    			 contrasenyaLletres = "";	//Reinicialitzem
			 	    		}
			 	    		
			 	    			else //Sino generem una contrasenya nomes Lletres / Numeros / Simbols / Majuscules
			 	    			{
			 	    				contrasenyaLletres = lletres(opcioLongitut);
			 	    			}
			 	    		
			 	    		
			 	    		
			 	    		if (opcioContrasenya[1] == 2)
			 	    		{
			 	    			
			 	    			contrasenyaNumeros = "";	
			 	    		}
			 	    		
			 	    			else 
			 	    			{
			 	    				contrasenyaNumeros = numeros(opcioLongitut); 
			 	    				
			 	    			}	
			 	    			
			 	    		
			 	    		
			 	    		
			 	    		
			 	    		if (opcioContrasenya[2] == 2)
			 	    		{
			 	    			contrasenyaMajuscules = "";
			 	    		}
			 	    		
			 	    			else
			 	    			{
			 	    				contrasenyaMajuscules = majuscules (opcioLongitut);
			 	    				
			 	    				
			 	    			}	
			 	    			
			 	    		
			 	    		
			 	    		
			 	    		if (opcioContrasenya[3] == 2)
			 	    		{
			 	    			contrasenyaSimbols = "";
			 	    		}
			 	    		
			 	    			else
			 	    			{
			 	    				contrasenyaSimbols = simbols (opcioLongitut);
			 	    				
			 	    			}
			 	    		
			 	    		 //Aqui Passem a la funcio tot tipus de contrasenya generada encara que hagi triat l'opcio o no i la longitut
			 	    		  String contrasenyaFinal = generarContrasenya(contrasenyaLletres, contrasenyaNumeros, contrasenyaMajuscules, contrasenyaSimbols, opcioLongitut);
			 	    	      System.out.println("Contraseña generada: " + contrasenyaFinal+"\n");
			 	    	 }
			 	    	 
			 	    	 
			 	    	 
			 	    	 
			 	    	 
			 	    break;
			 	    case 16:
			 	    	 System.out.println("Ha triat la funcio 16");
			 	    	 
			 	    	 String dates[];
			 	    	 
			 	    	 dates=separo[2].split(",");
			 	    	 
			 	    	int datesMin=Integer.parseInt(dates[0]);
			 	    	int datesMax=Integer.parseInt(dates[1]);
			 	    	                                                       

			 			//Zona de variables 
			 			int [] resultat;
			 			int data;
			 			//Zona de codi 
			 			resultat=valorsInicials(datesMin, datesMax);
			 			
			 			data=numAleatori(resultat);
			 			  
			 			System.out.println(data+"\n");
			 	    	 
			 	    	 
			 	    break;
			 	    case 17:
			 	    	 System.out.println("Ha triat la funcio 17 ");
			 		break;
			 	    case 18:
			 	    	 System.out.println("Ha triat la funcio 18 ");
			 	    break;
			 	    case 19:
			 	    	 System.out.println("Ha triat la funcio 19 ");
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
			 
			 Integer.parseInt(numero);
			 return true;
   		
   		
		        
		      
		 }catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
			System.out.println("numero buit");
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
			    	  //camps=linea.split("#")
		    	 /*if(!linea.equals("")) {
		    		  return;
		    	  }else {
		    		 
		    	  }*/
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
	
	
	//FUNCIONS GENERADES
	
	
	public static int [] opcions (int valor1, int valor2, int valor3) {
		int minim;
		int maxim;
		int decimals;
		int opcio[]=new int[3];
		
		//System.out.println("El valor escollit  es "+valor2);
		minim=valor2;
		
		if (minim==0)
		minim=0;
		
		//System.out.println("El valor escollit es "+valor3);
		maxim=valor3;
		
		if (maxim==0)
			maxim=1000;

		//System.out.print("Els decimals entrats son "+valor1);
		decimals=valor1;
		
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
	
	//Menu
		public static void menu () {
			//System.out.println("Entri siusplau els següents parametres per poder generar-li la contrasenya ------->");
		}
		 
		//Aqui demanem si vol minuscules, numeros, majuscules, simbols etc...
		public static int[] opcions(int valor1, int valor2, int valor3, int valor4, int longitut) {
			boolean condicio= true;
			int opcions [] = new int [5];

			
			while (condicio)
			{
				//System.out.println("Entri si vol lletres  1. SI / 2 NO:");
				int opcioLletres = valor1;
				
				if (opcioLletres < 1 || opcioLletres > 2)
				{
					System.out.println("OPCIO NO VALIDA TORNI A ENTRAR SI VOL LLETRES O NO");
				}
				
				else 
				{
					opcions[0]=opcioLletres;
					condicio=false;
				}
			}
			
			condicio = true;
			
			
			
			while (condicio)
			{
				//System.out.println("Entri si vol numeros  1. SI / 2 NO:");
				int opcioNumeros = valor2;
				
				if (opcioNumeros < 1 || opcioNumeros > 2)
				{
					System.out.println("OPCIO NO VALIDA TORNI A ENTRAR SI VOL NUMEROS O NO");
				}
				
				else 
				{
					opcions[1]=opcioNumeros;
					condicio=false;
				}
			}
			condicio = true;
			
			
			
			while (condicio)
			{
				//System.out.println("Entri si vol majuscules  1. SI / 2 NO:");
				int opcioMajuscules = valor3;
				
				if (opcioMajuscules < 1 || opcioMajuscules > 2)
				{
					System.out.println("OPCIO NO VALIDA TORNI A ENTRAR SI VOL MAJUSCULES O NO");
				}
				
				else 
				{
					opcions[2]=opcioMajuscules;
					condicio=false;
				}
			}
			condicio = true;
			
			
			
			while (condicio)
			{
				//System.out.println("Entri si vol simbols  1. SI / 2 NO:");
				int opcioSimbols = valor4;
				
				if (opcioSimbols < 1 || opcioSimbols > 2)
				{
					System.out.println("OPCIO NO VALIDA TORNI A ENTRAR SI VOL SIMBOLS O NO");
				}
				
				else 
				{
					opcions[3]=opcioSimbols;
					condicio=false;
				}
			}
			condicio = true;
			
			
			while (condicio)
			{
				//System.out.println("Entri la longitut de la contrasenya");
				int opcioLongitut = longitut;
				
				if (opcioLongitut < 3)
				{
					System.out.println("CONTRASENYA MOLT POC SEGURA POSI UNA LONGITUT MES GRAN DE 4");
				}
				
				else 
				{
					opcions[4]=opcioLongitut;
					condicio=false;
				}
			}
				
			
			return opcions;
		}
		
		//Generador de contrasenya nomes Lletres
		public static String lletres (int longitut) {
			
			//Creem un String amb totes les lletres del abecedari 
			 String caracters = "abcdefghijklmnopqrstuvwxyz";
		     Random random = new Random(); //Instanciem un Random 
		     String contrasenya = "";	//Aqui guardarem la contrasenya generada

		     
		     //Fem un bucle de la longitut de que ens ha passat l'usuari 
		        for (int i = 0; i < longitut; i++) 
		        {
		            int indexAleatori = random.nextInt(caracters.length());	//Crrem el random a partir de la longitut de l'String de caracters per seleccionar la posicio aleatoria
		            contrasenya += caracters.charAt(indexAleatori);	// Acumulem cada lletra a el nou String 
		        }

		        return contrasenya;
			    
			
			
		}
		
		public static String numeros (int longitut) {
			 String numeros = "123456789";	//Creem un String amb tots els numeros del 1 - 9
		     Random random = new Random();	//Instanciem el aleatori
		     String contrasenyaNumeros = "";	//Guardarem la contrasenya generada per numeros aqui a aquest String 
		     
		   //Fem un bucle de la longitut de que ens ha passat l'usuari 
		        for (int i = 0; i < longitut; i++) 
		        {
		        	//Guardem el numero aleatori a partir de la longitut passada
		            int indexAleatori = random.nextInt(numeros.length());
		            //Guardem a contrasenyaNumeros els numeros generats aleatoriament
		            contrasenyaNumeros += numeros.charAt(indexAleatori);	
		        }

		        return contrasenyaNumeros;
		}
		
		public static String majuscules (int longitut) {
			 String majuscules = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";		//Creem un String amb totes les lletres del abecedari amb majuscules
		     Random random = new Random();	//Instanciem un Random
		     String contrasenyaMajuscules = "";	//Guardarem la contrasenya generada aqui

		     //Creem un bucle per poder generar la contrasenya a partir de la longitut que ens han passat 
		        for (int i = 0; i < longitut; i++) 
		        {
		        	//Generem el numero aleatori a partir de la longitut de l'String majuscules
		            int indexAleatori = random.nextInt(majuscules.length());	
		            //Generem a contrasenya 
		            contrasenyaMajuscules += majuscules.charAt(indexAleatori);
		        }

		        return contrasenyaMajuscules;
		}
		
		public static String simbols (int longitut) {
			 String simbols = "!ºª&()#*+-¿?=¬~¨[ ]";	//Creem un String amb varis signes que Java accepti 
		     Random random = new Random();	//Instanciem un Random
		     String contrasenyaSimbols = "";	//Creem un nou String per guardar la contrasenya generada

		     //Creem un bucle per poder generar la contrasenya a partir de la longitut que ens han passat 
		        for (int i = 0; i < longitut; i++) 
		        {
		        	//Generem el numero aleatori a partir de la longitut de l'String simbols
		            int indexAleatori = random.nextInt(simbols.length());
		            contrasenyaSimbols += simbols.charAt(indexAleatori);	//ho guardem  a el nou String 
		        }

		        return contrasenyaSimbols;
		}
		
	    public static String generarContrasenya(String contrasenyaLletres, String contrasenyaNumeros, String contrasenyaMajuscules, String contrasenyaSimbols, int longitud) {
	        // Concatem tots els possibles caràcters en un sol String
	        String possiblesCaracteres = contrasenyaLletres + contrasenyaNumeros + contrasenyaMajuscules + contrasenyaSimbols;

	        // Verifiquem que no estigui buit el conjunt de caràcters possibles
	        if (possiblesCaracteres.isEmpty()) 
	        {
	            throw new IllegalArgumentException("No s'han proporcionat caràcters per generar la contrasenya.");
	        }
	        
	        // Creem un String per emmagatzemar la contrasenya generada
	        String contrasenyaGenerada = "";

	        // Creem el generador aleatori
	        Random random = new Random();

	        // Generem la contrasenya seleccionant els caràcters aleatoris 
	        for (int i = 0; i < longitud; i++) 
	        {
	            // Triem un caràcter aleatori del String 'possiblesCaracteres'
	            int indexAleatori = random.nextInt(possiblesCaracteres.length());
	            char caracterAleatori = possiblesCaracteres.charAt(indexAleatori);
	            contrasenyaGenerada += caracterAleatori;  // Afegim el caràcter a la contrasenya
	        }

	        return contrasenyaGenerada;
	    }
	    
	    
	    
	    public static int[] valorsInicials(int dataMin, int dataMax) {
	 		int resultat[]=new int[2];
			int min;
			int max;
			boolean condicio=true;
			
			
			while (condicio)
			{
			   // System.out.println("Indica siusplau una data minima i maxima per generar --> ");
			   // System.out.println("Els valors per defecte son: MINIM: 1900 I MAXIM 2023");
			   // System.out.println("Entri siusplau una data minima, si no vol entrar-ne cap entri un 0");
			    min = dataMin;

			   // System.out.println("Entri siusplau una data maxima, si no vol entrar-ne cap entri un 1");
			    max = dataMax;

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
