import java.util.Random;
import java.util.Scanner;

public class contrasenya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner (System.in);
		
		//Zona de variables 
		int opcioContrasenya[];
		String contrasenyaLletres;
		String contrasenyaNumeros;
		String contrasenyaMajuscules;
		String contrasenyaSimbols;
		
		
		//Imprimim el menu de benvinguda 
		menu();
		
		//Guardem totes les opcions rebudes enn un arrray desde el main 
		opcioContrasenya = opcions (teclat);
		
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
	      System.out.println("Contraseña generada: " + contrasenyaFinal);
	     
		

	}
	//Menu
	public static void menu () {
		System.out.println("Entri siusplau els següents parametres per poder generar-li la contrasenya ------->");
	}
	 
	//Aqui demanem si vol minuscules, numeros, majuscules, simbols etc...
	public static int[] opcions(Scanner teclat) {
		boolean condicio= true;
		int opcions [] = new int [5];

		
		while (condicio)
		{
			System.out.println("Entri si vol lletres  1. SI / 2 NO:");
			int opcioLletres = teclat.nextInt();
			
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
			System.out.println("Entri si vol numeros  1. SI / 2 NO:");
			int opcioNumeros = teclat.nextInt();
			
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
			System.out.println("Entri si vol majuscules  1. SI / 2 NO:");
			int opcioMajuscules = teclat.nextInt();
			
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
			System.out.println("Entri si vol simbols  1. SI / 2 NO:");
			int opcioSimbols = teclat.nextInt();
			
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
			System.out.println("Entri la longitut de la contrasenya  1. SI / 2 NO:");
			int opcioLongitut = teclat.nextInt();
			
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

	
	

}
