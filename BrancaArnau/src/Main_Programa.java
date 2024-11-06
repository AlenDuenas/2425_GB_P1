import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main_Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		//Zona de variables 
		String entrada []=new String [4];
		String lectura[]=new String [4];
		entrada=opcionsEntrada(teclat);	//Passem al array local totes les opcion entrades per teclat 
		
		
		//Passar la ruta a estring per fer el fitxer.txt
		try {
			FileWriter escritor = new FileWriter(entrada[3]+".txt");	//Creem el .txt per poder tenir d'on llegir les dades
		 
		
			escritor.write(entrada[0]+", "+ entrada[1]+", "+ entrada[2]+" \n");//escriptura 
	        escritor.close();//Tancament 
	        
	        
	        lectura=llegirEntrada(entrada); //En un altre array local cridem la funció i comprovem que llegeix correctament 
	        
	        
	        
	        
	        
		}catch (Exception IOSException) {
			IOSException.printStackTrace();
		}
		

	}

	public static void menu1() {	//Primer de tot imprimim el 1r menu per a procedir amb les següents instruccions 
		System.out.println("*******************************");
		System.out.println("Benvinguts al Mockaroo !");
		System.out.println("Siusplau entri les següents indicacions per teclat -->");

	}
	
	public static void menu2 () {
		System.out.println("*******************************");
		System.out.println("Ara entri els camps que vol obtenir de arxius");
		System.out.println("1: Nom");
		System.out.println("2: Cognoms");
		System.out.println("3: Ciutats");
		System.out.println("4: Adreçes");
		System.out.println("5: Professions");
		System.out.println("6: Pais");
		System.out.println("7: Estudis");
		System.out.println("8: Colors");
		System.out.println("9: URL");
		System.out.println("10: Noms de companyia");
		

	}
	
	
	
	public static String [] opcionsEntrada (Scanner teclat) {
		// Zona de variables
				String sortida1=".sql";
				String sortida2=".xml";
				int opcioSortida=0; 
				String ruta;
				int cantitatRegistres;
				boolean condicioMenu = true;
				String retorns [] = new String [4];
				// Zona de codi

				menu1(); // Imprimim el 1r menu per a que concateni amb el següent

				while (condicioMenu) // Quina de les dos sprtides vol triar 
				{
					System.out.println("Entri per teclat quin tipus de sortida de l'arxiu vol fer servir 1. SQL o 2. XML ");
					opcioSortida = teclat.nextInt();

					if (opcioSortida == 1 || opcioSortida == 2) {
						condicioMenu = false;
					}

					else {
						System.out.println("La opcio que a entrar per teclat no es correcta, torni a triar-la");
						condicioMenu = true;
					}
					retorns[0]=opcioSortida+"";

				}
				

				condicioMenu = true; //Reinicialitzem la variable condicio a true;
				while (condicioMenu) 
				{
					teclat.nextLine();
					System.out.println("Entri siusplau la ruta del arxiu on el vol guardar amb 2 \\ ");	//Fem que l'usuari per teclat ens entri la ruta on ho vol guardar
					ruta = teclat.nextLine();
					//Controlem que els primers caràcters estiguin ben escrits 
					if ((ruta.charAt(0) != 'c' && ruta.charAt(0) != 'C') || ruta.charAt(1) != ':' || ruta.charAt(2) != '\\') {
						System.out.println("Ruta de guardat de l'Arxiu no valid, torni a entrar la ruta correctament");
						condicioMenu = true;

					}

					else {	//Si l'usuari abans a triat una de les dos opcions l'hi agreguem al final de la ruta que ha entrat per teclat 
						retorns[3]=ruta; //Aqui ens guardem la ruta normal per poder crear l'arxiu .txt i d'allar llegir-ho tot i en una altra posició la ruta sencera
						
						if(opcioSortida==1)
						{
							ruta=ruta+sortida1;
						}
						
						else 
						{
							ruta=ruta+sortida2;
						}
						condicioMenu = false;
					}
					retorns[1]=ruta;

				}

				condicioMenu = true; //Tornem a reincialitzar la variable per a que ens entri en el bucle 
				while (condicioMenu) 
				{
					System.out.println("Per ultim la cantitat de registres que vol generar Minim 1 i Maxim 1000 Linies");	//Inserti les linies que vol generar 
					cantitatRegistres = teclat.nextInt();

					if (cantitatRegistres < 1 || cantitatRegistres > 1000) {		//Control d'errors 
						System.out.println(
								"Cantitat de registres invaalid, siusplau torni a entrar una cantitat entre 200 i 1000 Registres");
						condicioMenu = true;
					}

					else {

						condicioMenu = false;
					}
					
					retorns[2]=cantitatRegistres+" ";
				}
				
				return retorns;
	}
	
	public static String [] llegirEntrada(String entrada[]) {
		String linea="";
		
		String separat[]=null;
		
		try {
			 BufferedReader lector = new BufferedReader(new FileReader(entrada[3]+".txt"));	//Passem la ruta de l'arxiu on esta guardat per a que el llegeixi 
		       
			
		        while ((linea = lector.readLine()) != null)
		        {
		        	
		        	 separat = linea.split(","); 	//Separem el contingut per , que es com o guardem i imprimim Separat per veure que funciona 
		        	 System.out.println(Arrays.toString(separat));
		        }
		        
		       
		        lector.close();//Tanquem el lector
	        
		        return separat;//Tornem separat 
	        
		
	        
		}catch (Exception IOSException) {
			IOSException.printStackTrace();
		}
		return null;
	}
	
	/*public static int [] opcionsArxiuFitxers (Scanner teclat) {
		boolean condicio=true;
		int moltesOpcions []= new int [11];
		System.out.println("Ara entri quines dades vol generar -->");
		System.out.println("1: Nom");
		System.out.println("2: Cognom");
		System.out.println("3: Ciutats");
		System.out.println("4: Adreçes");
		System.out.println("5: Professions");
		System.out.println("6: Pais");
		System.out.println("7: Estudis");
		System.out.println("8: Colors");
		System.out.println("9: URL");
		System.out.println("10: Nom de Companyies");
		System.out.println("-1: Seleccionar dades generades -->");
		
		int opcions = teclat.nextInt();
		int i=0;
		while (condicio)
		{
			if (opcions > 0 && opcions < 11)
			{
				moltesOpcions[i]=opcions;
			}
			
			if (opcions == moltesOpcions[i])
			{
				System.out.println("Opcio Reptida");
			}
			
			else if (opcions == -1)
			{
				condicio=false;
			}
		}
		
		return moltesOpcions;
	}*/
	

}
