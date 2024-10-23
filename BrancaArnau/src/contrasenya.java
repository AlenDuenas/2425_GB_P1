import java.util.Random;
import java.util.Scanner;

public class contrasenya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner (System.in);
		int opcioContrasenya[];
		String contrasenyaLletres;
		String contrasenyaNumeros;
		String contrasenyaMajuscules;
		String contrasenyaSimbols;
		
		menu();
		opcioContrasenya = opcions (teclat);
		
		
		int opcioLongitut = opcioContrasenya[4];
		
		
		 
		if (opcioContrasenya[0] == 2) 
		{
			 contrasenyaLletres = "";
		}
		
			else 
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
		
		 
		  String contrasenya = generarContrasenya(contrasenyaLletres, contrasenyaNumeros, contrasenyaMajuscules, contrasenyaSimbols, opcioLongitut);
	        System.out.println("Contraseña generada: " + contrasenya);
	     
		

	}
	
	public static void menu () {
		System.out.println("Entri siusplau els següents parametres per poder generar-li la contrasenya ------->");
	}
	 

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
	
	public static String lletres (int longitut) {
		
		 String caracters = "abcdefghijklmnopqrstuvwxyz";
	     Random random = new Random();
	     String contrasenya = "";

	        for (int i = 0; i < longitut; i++) {
	            int indexAleatori = random.nextInt(caracters.length());
	            contrasenya += caracters.charAt(indexAleatori);
	        }

	        return contrasenya;
		    
		
		
	}
	
	public static String numeros (int longitut) {
		 String numeros = "123456789";
	     Random random = new Random();
	     String contrasenyaNumeros = "";

	        for (int i = 0; i < longitut; i++) {
	            int indexAleatori = random.nextInt(numeros.length());
	            contrasenyaNumeros += numeros.charAt(indexAleatori);
	        }

	        return contrasenyaNumeros;
	}
	
	public static String majuscules (int longitut) {
		 String majuscules = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     Random random = new Random();
	     String contrasenyaMajuscules = "";

	        for (int i = 0; i < longitut; i++) {
	            int indexAleatori = random.nextInt(majuscules.length());
	            contrasenyaMajuscules += majuscules.charAt(indexAleatori);
	        }

	        return contrasenyaMajuscules;
	}
	
	public static String simbols (int longitut) {
		 String simbols = "!ºª&()#*+-¿?=¬~¨[ ]";
	     Random random = new Random();
	     String contrasenyaSimbols = "";

	        for (int i = 0; i < longitut; i++) {
	            int indexAleatori = random.nextInt(simbols.length());
	            contrasenyaSimbols += simbols.charAt(indexAleatori);
	        }

	        return contrasenyaSimbols;
	}
	
	public static String generarContrasenya(String contrasenyaLletres, String contrasenyaNumeros, String contrasenyaMajuscules, String contrasenyaSimbols, int longitud) {
	        // Concatenamos todos los posibles caracteres en un solo String
	        String posiblesCaracteres = contrasenyaLletres + contrasenyaNumeros + contrasenyaMajuscules + contrasenyaSimbols;

	        // Verificamos que no esté vacío el conjunto de caracteres posibles
	        if (posiblesCaracteres.isEmpty()) {
	            throw new IllegalArgumentException("No se han proporcionado caracteres para generar la contraseña.");
	        }

	        // Creamos un String para almacenar la contraseña generada
	        String contrasenyaGenerada = "";

	        // Creamos el generador aleatorio
	        Random random = new Random();

	        // Generamos la contraseña seleccionando caracteres aleatorios del conjunto de posibles caracteres
	        for (int i = 0; i < longitud; i++) {
	            // Elegimos un carácter aleatorio del String 'posiblesCaracteres'
	            int indexAleatorio = random.nextInt(posiblesCaracteres.length());
	            char caracterAleatorio = posiblesCaracteres.charAt(indexAleatorio);
	            contrasenyaGenerada += caracterAleatorio;  // Añadimos el carácter a la contraseña
	        }

	        return contrasenyaGenerada;
	    }
	
	

}
