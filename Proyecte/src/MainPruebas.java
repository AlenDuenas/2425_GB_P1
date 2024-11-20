import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

 
public class MainPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*autonumeric(2);
		System.out.println();
		System.out.println(bolean()+"\n");
		System.out.println(GenerarIban()+"\n");
		System.out.println(ip()+"\n");
		System.out.println(nom()+"\n");
		System.out.println(cognom()+"\n");
		System.out.println(ciutat()+"\n");
		System.out.println(adreça()+"\n");
		System.out.println(professio()+"\n");
		System.out.println(estudi()+"\n");
		System.out.println(color()+"\n");
		System.out.println(url()+"\n");
		System.out.println(companyia()+"\n");
		contra();*/
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))){
			writer.write(bolean()+"\n");
			writer.write(GenerarIban()+"\n");
			writer.write(DNI()+"\n");
			writer.write(ip()+"\n");
			writer.write(nom()+"\n");
			writer.write(cognom()+"\n");
			writer.write(ciutat()+"\n");
			writer.write(adreça()+"\n");
			writer.write(professio()+"\n");
			writer.write(estudi()+"\n");
			writer.write(color()+"\n");
			writer.write(url()+"\n");
			writer.write(companyia()+"\n");
			writer.write(contra());
			//writer.write();
			//writer.write();
			//writer.write();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}


	public static void autonumeric(int numLineas) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Autonumeric: Introdueix 0 pel valor predeterminat");
		 int numI = teclado.nextInt();
		 if (numI <= 0) { numI = 1;}
		 int []a  = new int[numLineas];
		 for(int i = 0; i < numLineas; i++) {
			 a[i] = numI;
			 System.out.println(a[i]);
			 
			 numI++;
		 }
	}

	public static String bolean() {
		Random random = new Random();
		int num = random.nextInt(2);  
		String a = "";
		if (num ==1) {a = "true";}
		if (num == 0) {a = "false";}

		//System.out.println(a);
		return a;
	}

	public static String DNI() {
		String dni;
		Random random = new Random();
		int numero = 10000000 + random.nextInt(90000000);
		//Posicion letra
		int posicion = numero % 23;

		// Array con letras de dni
		String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
				"X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
				"C", "K", "E"};
		// Formar el DNI completo
		dni = String.valueOf(numero) + letras[posicion];
		return dni;
	}

	public static String GenerarIban(){
		Random random = new Random();
		String CC = "00";
		int KK = random.nextInt(100);
		// Tots els arrays comparteixen posicions 0182 és bbva, AL són 28 caràcters i 4 de sucursal.
		// Còdigs de tots els bancs
		String[] BBBB = {
				"0182", "0049", "2100", "0081", "2038", "1465", "3058", "2103", "2095", "0075",
				"0128", "0073", "2105", "0239", "2048", "2080", "0019", "1450", "1465", "1491",
				"0186", "0260", "0089", "0275", "0030", "3100", "2108", "0019", "0216", "2085",
				"0093", "0154", "0232", "0049", "0024", "3001", "3098", "2100", "2096", "2095",
				"3111", "0031", "2077", "0183", "0208", "0099", "0244", "0182", "0030", "0267"
		};

		// Array de noms de bancs
		// No és necessari per al codi

		// Array de les sigles de països
		String[] ES = {
				"AL", "AD", "AT", "AZ", "BH", "BE", "BA", "BR", "BG", "CR", 
				"HR", "CY", "CZ", "DK", "DO", "EE", "FO", "FI", "FR", "GE",
				"DE", "GI", "GR", "GL", "GT", "HU", "IS", "IE", "IL", "IT", 
				"JO", "KZ", "XK", "KW", "LV", "LB", "LI", "LT", "LU", "MT", 
				"MR", "MU", "MD", "MC", "ME", "NL", "NO", "PK", "PL", "PT", 
				"RO", "SM", "SA", "RS", "SK", "SI", "ES", "SE", "CH", "TL", 
				"TN", "TR", "UA", "AE", "GB", "VG"
		};

		// Array amb el nombre de caràcters de l'IBAN per a cada país
		int[] numCaracteres = {
				28, 24, 20, 28, 22, 16, 20, 29, 22, 21, 
				21, 28, 24, 18, 28, 20, 18, 18, 27, 22, 
				22, 23, 27, 18, 28, 28, 26, 22, 23, 27, 
				30, 20, 20, 30, 21, 28, 21, 20, 31, 27, 
				27, 30, 24, 27, 18, 24, 28, 25, 24, 27, 
				24, 27, 22, 20, 24, 22, 24, 21, 30, 24, 
				26, 29, 28, 23, 22
		};
		// Array amb la longitud del codi de sucursal de cada país
		int[] longitudesCodigosSucursal = {
				4,  // Albània
				4,  // Andorra
				5,  // Àustria
				4,  // Azerbaidjan
				4,  // Bahrain
				3,  // Bèlgica
				4,  // Bòsnia i Hercegovina
				4,  // Brasil
				4,  // Bulgària
				4,  // Costa Rica
				7,  // Croàcia
				5,  // Xipre
				4,  // República Txeca
				4,  // Dinamarca
				4,  // República Dominicana
				2,  // Estònia
				4,  // Illes Fèroe
				4,  // Finlàndia
				5,  // França
				6,  // Geòrgia
				8,  // Alemanya
				4,  // Gibraltar
				7,  // Grècia
				4,  // Groenlàndia
				4,  // Guatemala
				4,  // Hongria
				4,  // Islàndia
				4,  // Irlanda
				4,  // Israel
				5,  // Itàlia
				6,  // Jordània
				6,  // Kazakhstan
				4,  // Kosovo
				2,  // Kuwait
				2,  // Letònia
				6,  // Líbano
				7,  // Liechtenstein
				4,  // Lituània
				3,  // Luxemburg
				4,  // Malta
				5,  // Mauritània
				5,  // Maurici
				2,  // Moldàvia
				5,  // Mònaco
				4,  // Montenegro
				6,  // Països Baixos
				6,  // Noruega
				4,  // Pakistan
				6,  // Polònia
				4,  // Portugal
				4,  // Romania
				5,  // San Marino
				4,  // Aràbia Saudita
				6,  // Sèrbia
				6,  // Eslovàquia
				4,  // Eslovènia
				4,  // Espanya
				4,  // Suècia
				5,  // Suïssa
				4,  // Timor Oriental
				4,  // Tunísia
				4,  // Turquia
				29, // Ucraïna
				3,  // Emirats Àrabs Units
				6,  // Regne Unit
				4   // Illes Verges Britàniques
		};

		String[] codPais = {
				"1014", // AL
				"1013", // AD
				"1014", // AT
				"1028", // AZ
				"2018", // BH
				"1414", // BE
				"1214", // BA
				"2018", // BR
				"2014", // BG
				"1218", // CR
				"1812", // HR
				"1412", // CY
				"1228", // CZ
				"1414", // DK
				"2014", // DO
				"1412", // EE
				"1428", // FO
				"1518", // FI
				"1512", // FR
				"0714", // GE
				"1413", // DE
				"1712", // GI
				"1714", // GR
				"1212", // GL
				"0714", // GT
				"0812", // HU
				"1914", // IS
				"0912", // IE
				"0912", // IL
				"1912", // IT
				"1012", // JO
				"2028", // KZ
				"2010", // XK
				"2014", // KW
				"2014", // LV
				"1212", // LB
				"1912", // LI
				"2012", // LT
				"2012", // LU
				"1318", // MT
				"2014", // MR
				"2014", // MU
				"2012", // MD
				"2012", // MC
				"2014", // ME
				"2012", // NL
				"2012", // NO
				"2014", // PK
				"2012", // PL
				"2012", // PT
				"2014", // RO
				"2014", // SM
				"2018", // SA
				"2012", // RS
				"2014", // SK
				"2014", // SI
				"1428", // ES
				"2012", // SE
				"2012", // CH
				"2012", // TL
				"2018", // TN
				"2012", // TR
				"2012", // UA
				"2018", // AE
				"2018", // GB
				"2014"  // VG
		};

		String NNNN = "";
		int num = random.nextInt(50);
		String GGGG = "";
		// Per generar el codi de sucursal
		for (int i = 0; i <= longitudesCodigosSucursal[num]; i++) {
			GGGG = GGGG + random.nextInt(10) + "";
		}
		numCaracteres[num]  = numCaracteres[num] - 2 - 4 - 4 - longitudesCodigosSucursal[num];

		for (int i = 0; i < numCaracteres[num]; i++) {
			NNNN = NNNN + random.nextInt(10) + "";
		}
		// Imprimir IBAN (es pot fer sense la variable IBAN però pot ser útil tenir-ho així)

		String temporal = NNNN + KK +  BBBB[num] + GGGG + codPais[num] + CC;
		/* Paso el String temporal a un BigInteger per tenir la concatenació completa com un número
                  Com no puc usar el % i el .mod(97) tampoc crec un altre big int per la divisió de 97
                  Necessito crear un bigint per cada operació que vull fer
		 */
		BigInteger temporalNum = new BigInteger(temporal);
		BigInteger divisor = BigInteger.valueOf(97);
		BigInteger restador = BigInteger.valueOf(98);
		BigInteger uno = BigInteger.valueOf(1);
		temporalNum = temporalNum.mod(divisor);
		CC = restador.subtract(temporalNum).toString();
		temporal = NNNN + KK +  BBBB[num] + GGGG + codPais[num] + CC;
		temporalNum = new BigInteger(temporal);
		temporalNum = temporalNum.mod(divisor);
		if (!temporalNum.equals(uno)) {
			GenerarIban();
		}
		//System.out.println(ES[num] +" "+ CC +" "+ BBBB[num] +" "+ GGGG +" "+ KK +" "+NNNN);
		String IbanFinal = ES[num] +" "+ CC +" "+ BBBB[num] +" "+ GGGG +" "+ KK +" "+NNNN;
		return IbanFinal;

	}

	public static String ip() {
		Random random = new Random();
		int num = random.nextInt(256);
		int num2 = random.nextInt(256);
		int num3 = random.nextInt(256);
		int num4 = random.nextInt(256);
		//System.out.println(num + "." + num2 + "." + num3 + "." + num4);
		return num + "." + num2 + "." + num3 + "." + num4;

	} 

	private static String nom() {
		Random random = new Random();
		String[] lineaNom = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("1.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaNom.length) {
					lineaNom[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno un nom random
		if (lineaNom.length > 0) {
			return lineaNom[random.nextInt(lineaNom.length)];
		}
		return null; 
	}

	private static String cognom() {
		Random random = new Random();
		String[] lineaCognom = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("2.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaCognom.length) {
					lineaCognom[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno un cognom random
		if (lineaCognom.length > 0) {
			return lineaCognom[random.nextInt(lineaCognom.length)];
		}
		return null;  
	}

	private static String ciutat() {
		Random random = new Random();
		String[] lineaCiutat = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("3 i 6.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaCiutat.length) {
					lineaCiutat[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno una ciutat random
		if (lineaCiutat.length > 0) {
			return lineaCiutat[random.nextInt(lineaCiutat.length)];
		}
		return null;  
	}

	private static String adreça() {
		Random random = new Random();
		String[] lineaAdreça = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("4.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaAdreça.length) {
					lineaAdreça[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno una adreça random
		if (lineaAdreça.length > 0) {
			return lineaAdreça[random.nextInt(lineaAdreça.length)];
		}
		return null;  
	}

	private static String professio() {
		Random random = new Random();
		String[] lineaProfessio = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("5.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaProfessio.length) {
					lineaProfessio[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno una professio random
		if (lineaProfessio.length > 0) {
			return lineaProfessio[random.nextInt(lineaProfessio.length)];
		}
		return null;
	}

	private static String estudi() {
		Random random = new Random();
		String[] lineaEstudi = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("7.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaEstudi.length) {
					lineaEstudi[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno un estudi random
		if (lineaEstudi.length > 0) {
			return lineaEstudi[random.nextInt(lineaEstudi.length)];
		}
		return null;
	}

	private static String color() {
		Random random = new Random();
		String[] lineaColor = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("8.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaColor.length) {
					lineaColor[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno un color random
		if (lineaColor.length > 0) {
			return lineaColor[random.nextInt(lineaColor.length)];
		}
		return null;
	}

	private static String url() {
		Random random = new Random();
		String[] lineaUrl = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("9.txt"))) {
			String temporal;
			int cont = 0;

			// Llegeixo les linies i les emmagatzemo en un array
			while ((temporal = br.readLine()) != null) {
				if (cont < lineaUrl.length) {
					lineaUrl[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Retorno una url random
		if (lineaUrl.length > 0) {
			return lineaUrl[random.nextInt(lineaUrl.length)];
		}
		return null;
	}

	private static String companyia() {
		Random random = new Random();
		String[] lineaCompanyia = new String[161];  
		try (BufferedReader br = new BufferedReader(new FileReader("10.txt"))) {
			String temporal;
			int cont = 0;

			// Read lines and store in array

			while ((temporal = br.readLine()) != null) {
				if (cont < lineaCompanyia.length) {
					lineaCompanyia[cont] = temporal;
					cont++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Return a random company name
		if (lineaCompanyia.length > 0) {
			return lineaCompanyia[random.nextInt(lineaCompanyia.length)];
		}
		return null;  // If no companies were loaded
	}
	
	public static String contra() {
		//Zona de variables 
		int opcioContrasenya[];
		String contrasenyaLletres;
		String contrasenyaNumeros;
		String contrasenyaMajuscules;
		String contrasenyaSimbols;
		
		 
		//Imprimim el menu de benvinguda 
		menu();
		
		//Guardem totes les opcions rebudes enn un arrray desde el main 
		opcioContrasenya = opcions ();
		
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
	      return contrasenyaFinal;
	}
	
	//Menu
		public static void menu () {
			System.out.println("Entri siusplau els següents parametres per poder generar-li la contrasenya ------->");
		}
		 
		//Aqui demanem si vol minuscules, numeros, majuscules, simbols etc...
		public static int[] opcions() {
			Scanner teclat=new Scanner (System.in);
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
