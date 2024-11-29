

import java.io.*;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class MenuNouFuncional {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclat = new Scanner(System.in);


        String [] lectura = OpcionsCamp0 (teclat);	//Opcions de l'arxiu d'entrada

        String resultats[] = funcions (lectura);






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





    public static String[] funcions (String [] lectura) {
        int cont=0;
        String separo[];
        boolean compleix = true;
        boolean errors = false;

        String primeraLinia=primeraLinia();
        String sepPrimera[] = primeraLinia.split("#");
        int registres = Integer.parseInt(sepPrimera[2]);


        int mida  = registres*lectura.length;

        String  resultat[]=new String [mida];	//Creo dos arrays per poder guardar el nom i el resultat generat en la funcio que cridi
        String nom[]=new String [mida];



        try {



            // liniaI ();



            for (int i=0; i < lectura.length;i++)
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
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = nom() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 2:
                            System.out.println("Ha triat la funcio 2 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = cognom() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 3:
                            System.out.println("Ha triat la funcio 3 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = ciutats() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 4:
                            System.out.println("Ha triat la funcio 4 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = adreça() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 5:
                            System.out.println("Ha triat la funcio 5 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = professio() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 6:
                            System.out.println("Ha triat la funcio 6 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = paisos() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 7:
                            System.out.println("Ha triat la funcio 7 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = estudi() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 8:
                            System.out.println("Ha triat la funcio 8 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = color() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 9:
                            System.out.println("Ha triat la funcio 9 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = url() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 10:
                            System.out.println("Ha triat la funcio 10 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = companyia() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 11:
                            System.out.println("Ha triat la funcio 11 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = Boolean2() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 12:
                            System.out.println("Ha triat la funcio 12 ");
                            double resultatDouble;
                            int opcions[];

                            String coma[] = separo[2].split(",");
                            int valor1 = Integer.parseInt(coma[0]);
                            int valor2 = Integer.parseInt(coma[1]);
                            int valor3 = Integer.parseInt(coma[2]);

                            //for(int j=0; j<registres;j++) {


                            if (valor1 <= 15 && valor1 > 0 && valor2 > 0 && valor2 < 999 && valor3 > 0 && valor3 <= 1000) {

                                for (int reg =0;reg<registres;reg++) {
                                    opcions = opcions(valor1, valor2, valor3);
                                    resultatDouble = numInt(opcions[0], opcions[1], opcions[2]);

                                    resultat[reg+(i*registres)] = resultatDouble + " ";	//Guardo el resultat a la mateixa posicio del bucle
                                    nom[reg+(i*registres)] = separo[1];
                                    cont++;


                                    System.out.println("El número es " + resultatDouble + "Registre: " + reg+ i + registres + "\n");
                                }
                            }

                            else
                            {
                                errors = true;
                            }	//System.out.println("Holaxx");
                            // }


                            break;
                        case 13:
                            System.out.println("Ha triat la funcio 13 ");
                            
                            String opcionsEmail[];

                            opcionsEmail=separo[2].split(",");

                            int opEmail1=Integer.parseInt(opcionsEmail[0]);
                            int opEmail2=Integer.parseInt(opcionsEmail[1]);
                            
                            
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = mails(opEmail1, opEmail2) + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 14:
                            System.out.println("Ha triat la funcio 14 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = IPV4() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
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

                            //for (int z=0; z<registres; z++)
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

                                for (int reg=0;reg<registres;reg++) {
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
                                    System.out.println("Contraseña generada: " + contrasenyaFinal +  reg+ i + registres +"\n");

                                    resultat[reg+(i*registres)]=  contrasenyaFinal+"";//Guardo el resultat a la mateixa posicio del bucle
                                    nom [reg+(i*registres)]= separo[1];
                                    cont++;
                                }
                                //System.out.println(resultat[k]);
                                //System.out.println(nom[k]);
                            }





                            break;
                        case 16:
                            System.out.println("Ha triat la funcio 16");

                            String dates[];

                            dates=separo[2].split(",");

                            int datesMin=Integer.parseInt(dates[0]);
                            int datesMax=Integer.parseInt(dates[1]);


                            //Zona de variables
                            int [] resData;
                            int data;
                            //Zona de codi
                            for (int reg=0;reg<registres;reg++) {
                                resData=valorsInicials(datesMin, datesMax);

                                data=numAleatori(resData);

                                System.out.println(data +  reg+ i + lectura.length +"\n");

                                resultat[reg+(i*registres)]=  data+"";//Guardo el resultat a la mateixa posicio del bucle
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            //System.out.println(resultat[k]);
                            //System.out.println(nom[k]);

                            break;
                        case 17:
                            System.out.println("Ha triat la funcio 17 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = GenerarIban() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 18:
                            System.out.println("Ha triat la funcio 18 ");
                            for (int reg =0;reg<registres;reg++) {
                                resultat[reg+(i*registres)] = DNI() + " ";
                                nom[reg+(i*registres)] = separo[1];
                                cont++;
                            }
                            break;
                        case 19:
                            System.out.println("Ha triat la funcio 19 ");
                            break;
                        default:
                            System.out.println("opcio no valida");

                            break;

                    }

                    if (resultat[i]!=null && nom[i]!=null)
                        System.out.println("Nom: " + nom[i] + ", Resultat: " + resultat[i]);




                }
                if(!compleix)
                {
                    errors =true;
                }

                //if (resultat[i]!=null && nom[i]!=null)
                //arxiuXML(resultat, nom);


            }
            //comprovacio dades generades
            for (int i=0;i<resultat.length;i++)
            {
                System.out.println(i + " -> " + nom[i] + ": " + resultat[i]);
            }

            String asd[] = primeraLinia().split("#");

            if (asd[0].equals("XML")){
                arxiuXML(resultat, nom, registres, lectura.length);
                arxiuXSLT(resultat, nom, registres, lectura.length);
                arxiuXSD(nom, registres, lectura.length);
            }

          

           

            if(asd[0].equals("SQL")){
               
            	sql(resultat, nom, registres, lectura.length);

               
            }
            //if (resultat[i]!=null && nom[i]!=null)
            //arxiuXML(resultat, nom, registres, lectura.length);
            //arxiuXSLT(resultat, nom, registres, lectura.length);
            //arxiuXSD(nom, registres, lectura.length);


            if(errors)
            {
                System.out.println("L'arxiu d'entrada te ERRORS");
            }

            return resultat;

        }catch (Exception pasanCosas) {
            pasanCosas.printStackTrace();
        }

        return null;
    }

    private static void arxiuXML(String[] resultat, String[] nom, int registres, int lenght) {
        try {
            // Archivo de destino
            File desti = new File("C:\\Users\\arnau\\Documents\\resultat.xml");
            PrintWriter impressora = new PrintWriter(desti);

            // Encabezado XML
            String primeraLinia = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            impressora.println(primeraLinia);

            // Nodo raíz
            String elementRoot = "<registres>";
            impressora.println(elementRoot);

            // Generar los registros
            for (int i = 0; i < registres; i++) {
                impressora.println("  <element>");
                for (int j = 0; j < lenght; j++) {
                    String etiqueta = nom[i + (j * registres)];
                    String valor = resultat[i + (j * registres)];
                    impressora.println("    <" + etiqueta + ">" + valor + "</" + etiqueta + ">");
                }
                impressora.println("  </element>");
            }

            // Cerrar el nodo raíz
            String tancament = "</registres>";
            impressora.println(tancament);

            // Finalizar la escritura
            impressora.flush();
            impressora.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void arxiuXSD(String[] nom, int registres, int lenght) {
        try {
            File desti = new File("C:\\Users\\arnau\\Documents\\schema.xsd");
            PrintWriter escriure = new PrintWriter(desti);

            String inicioXSD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                    + "<xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\"\n"
                    + "            targetNamespace=\"http://www.example.com\"\n"
                    + "            xmlns=\"http://www.example.com\"\n"
                    + "            elementFormDefault=\"qualified\">\n";

            String tipoRegistro = "  <xs:complexType name=\"registro\">\n"
                    + "    <xs:sequence>\n";

            for (int i = 0; i < (registres * lenght); i++) {
                tipoRegistro += "      <xs:element name=\"" + nom[i] + "\" type=\"xs:string\"/>\n";
            }

            tipoRegistro += "    </xs:sequence>\n"
                    + "  </xs:complexType>\n";

            String tipoRegistres = "  <xs:element name=\"registres\">\n"
                    + "    <xs:complexType>\n"
                    + "      <xs:sequence>\n"
                    + "        <xs:element name=\"registro\" type=\"registro\" maxOccurs=\"unbounded\"/>\n"
                    + "      </xs:sequence>\n"
                    + "    </xs:complexType>\n"
                    + "  </xs:element>\n";

            String finXSD = "</xs:schema>";

            escriure.println(inicioXSD + tipoRegistro + tipoRegistres + finXSD);

            escriure.flush();
            escriure.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void arxiuXSLT(String[] resultat, String[] nom, int registres, int lenght) {
        try {
            File desti = new File("C:\\Users\\arnau\\Documents\\transform.xslt");
            PrintWriter escriure = new PrintWriter(desti);
            File desti2 = new File("C:\\Users\\arnau\\Documents\\resultat.html");
            PrintWriter escriure1 = new PrintWriter(desti2);

            String inici = "<?xml version=\"1.0\"?>\n\n"
                    + "<xsl:stylesheet version=\"1.0\"\n"
                    + "xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n\n"
                    + "<xsl:template match=\"/\">\n"
                    + "  <html>\n"
                    + "  <body>\n"
                    + "    <table border=\"1\">\n"
                    + "      <thead>\n"
                    + "        <tr bgcolor=\"#9acd32\">\n";

            for (int i = 0; i < lenght; i++) {
                inici += "          <th>"+nom[i*registres]+"</th>\n";
            }

            inici += "        </tr>\n"
                    + "      </thead>\n"
                    + "      <tbody>\n";

            String info = "";
            for (int j = 0; j < registres; j++) {
                info += "        <tr>\n";
                for (int i = 0; i < lenght; i++) {
                    int index = (i * registres) + j;

                    String valor;
                    if (index < resultat.length) {
                        valor = resultat[index];
                    } else {
                        valor = "null";
                    }

                    info += "          <td>" + valor + "</td>\n";
                }
                info += "        </tr>\n";
            }

            String fi = "      </tbody>\n"
                    + "    </table>\n"
                    + "  </body>\n"
                    + "  </html>\n"
                    + "</xsl:template>\n\n"
                    + "</xsl:stylesheet>";

            escriure.println(inici + info + fi);
            escriure1.println(inici + info + fi);

            escriure.flush();
            escriure.close();

            escriure1.flush();
            escriure1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Funcio que retorna noms aleatoris de l'arxiu noms
    private static String nom() {
        Random random = new Random();
        String[] lineaNom = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\\\Documents\\ArxiusEjemplo\\1.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaNom.length) {
                    lineaNom[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno un nom random
        if (lineaNom.length > 0) {
            return lineaNom[random.nextInt(lineaNom.length)];
        }
        return null;
    }

    //Funcio que retorna cognoms aleatoris de l'arxiu cognoms
    private static String cognom() {
        Random random = new Random();
        String[] lineaCognom = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\2.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaCognom.length) {
                    lineaCognom[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno un cognom random
        if (lineaCognom.length > 0) {
            return lineaCognom[random.nextInt(lineaCognom.length)];
        }
        return null;
    }

    //Funcio que retorna ciutats aleatories de l'arxiu ciutats
    private static String ciutats() {
        Random random = new Random();
        String[] lineaCiutat = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\3.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaCiutat.length) {
                    lineaCiutat[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno una ciutat random
        if (lineaCiutat.length > 0) {
            return lineaCiutat[random.nextInt(lineaCiutat.length)];
        }
        return null;
    }

    //Funcio que retorna adreces aleatories de l'arxiu adreces
    private static String adreça() {
        Random random = new Random();
        String[] lineaAdreça = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\4.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaAdreça.length) {
                    lineaAdreça[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno una adreça random
        if (lineaAdreça.length > 0) {
            return lineaAdreça[random.nextInt(lineaAdreça.length)];
        }
        return null;
    }

    //Funcio que retorna professions aleatories de l'arxiu professions
    private static String professio() {
        Random random = new Random();
        String[] lineaProfessio = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\5.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaProfessio.length) {
                    lineaProfessio[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno una professio random
        if (lineaProfessio.length > 0) {
            return lineaProfessio[random.nextInt(lineaProfessio.length)];
        }
        return null;
    }

    //Funcio que retorna paisos aleatoris de l'arxiu paisos
    private static String paisos() {
        Random random = new Random();
        String[] lineaPais = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\6.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaPais.length) {
                    lineaPais[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno un pais random
        if (lineaPais.length > 0) {
            return lineaPais[random.nextInt(lineaPais.length)];
        }
        return null;
    }

    //Funcio que retorna estudis aleatoris de l'arxiu estudis
    private static String estudi() {
        Random random = new Random();
        String[] lineaEstudi = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\7.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaEstudi.length) {
                    lineaEstudi[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno un estudi random
        if (lineaEstudi.length > 0) {
            return lineaEstudi[random.nextInt(lineaEstudi.length)];
        }
        return null;
    }

    //Funcio que retorna colors aleatoris de l'arxiu colors
    private static String color() {
        Random random = new Random();
        String[] lineaColor = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\8.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaColor.length) {
                    lineaColor[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno un color random
        if (lineaColor.length > 0) {
            return lineaColor[random.nextInt(lineaColor.length)];
        }
        return null;
    }

    //Funcio que retorna urls aleatories de l'arxiu urls
    private static String url() {
        Random random = new Random();
        String[] lineaUrl = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\9.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaUrl.length) {
                    lineaUrl[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno una url random
        if (lineaUrl.length > 0) {
            return lineaUrl[random.nextInt(lineaUrl.length)];
        }
        return null;
    }

    //Funcio que retorna companyies aleatoris de l'arxiu companyies
    private static String companyia() {
        Random random = new Random();
        String[] lineaCompanyia = new String[161];
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arnau\\Documents\\ArxiusEjemplo\\10.txt"))) {
            String temporal;
            int cont = 0;

            // Llegeixo les linies i les emmagatzemo en un array
            while ((temporal = br.readLine()) != null) {
                if (cont < lineaCompanyia.length) {
                    lineaCompanyia[cont] = temporal;
                    cont++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Retorno una companyia random
        if (lineaCompanyia.length > 0) {
            return lineaCompanyia[random.nextInt(lineaCompanyia.length)];
        }
        return null;  // If no companies were loaded
    }

    public static boolean Boolean2() {
        Random random = new Random();
        int num = random.nextInt(2);
        boolean a = false;
        if (num ==1) {a = true;}
        if (num == 0) {a = false;}
        return a;
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
        Random bombo=new Random();


        // Generar un número aleatori amb decimals dins del rang
        double numAleatorio =0;
        numAleatorio = minim + (maxim - minim) * bombo.nextDouble();

        // Redondeja el número a la cantitat de decimals especificada
        double factor = Math.pow(10, decimals);  // Factor per moure els decimals
        double numero = Math.round(numAleatorio * factor) / factor;


        return numero;
    }

    public static String IPV4(){
        Random random = new Random();
        int num = random.nextInt(256);
        int num2 = random.nextInt(256);
        int num3 = random.nextInt(256);
        int num4 = random.nextInt(256);
        return (num + "." + num2 + "." + num3 + "." + num4);
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





        //	System.out.println("Els valors son: ANY MINIM "+resultat[0]+" i ANY MAXIM "+resultat[1]);


        return resultat;
    }


    public static int numAleatori(int[] valors) {
        Random bombo=new Random();
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

    public static String DNI() {
        Random random = new Random();
        int numero = 10000000 + random.nextInt(90000000);
        // Posició lletra
        int posicion = numero % 23;

        // Array amb les lletres del DNI
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
                "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L",
                "C", "K", "E"};
        // Formar el DNI complet
        String dni="";
        return dni = String.valueOf(numero) + letras[posicion];
    }

    /*public static void insert(String[] estructura, String[] insert, String tabla, File archivo, int registres) {

    	  try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
    	        // Construir la estructura de la tabla
    	        String estructuraStr = String.join(", ", estructura);

    	        // Escribir la instrucción de creación de la tabla
    	        writer.write("  CREATE TABLE IF NOT EXISTS " + tabla + " (" + estructuraStr + ");");
    	        writer.newLine();

    	        // Construir y escribir la instrucción INSERT
    	        for (int i = 0; i < registres; i++) { // Escribir la sentencia INSERT tres veces como ejemplo
    	            StringBuilder valores = new StringBuilder();

    	            for (String valor : insert) {
    	                // Agregar comillas simples a todos los valores excepto si parecen números
    	                try {
    	                    Double.parseDouble(valor); // Intentar convertir a número
    	                    valores.append(valor); // Si es un número, no agregar comillas
    	                } catch (NumberFormatException e) {
    	                    valores.append("'").append(valor).append("'"); // Si no, agregar comillas
    	                }
    	                valores.append(", ");
    	            }
    	            // Eliminar la última coma y espacio
    	            valores.setLength(valores.length() - 2);

    	            // Escribir la instrucción INSERT
    	            writer.write("INSERT INTO " + tabla + " (" + estructuraStr + ") VALUES (" + valores + ");");
    	            writer.newLine();
    	        }

    	        writer.flush();
    	        System.out.println("SQL escrito en el archivo correctamente.");

    	    } catch (IOException e) {
    	        e.printStackTrace();
    	    }
    }*/
    public static void sql(String[] resultat, String[] nom, int registres, int length) {
    	  File dsa = new File("C:\\Users\\arnau\\Documents\\Salida.sql");
    	 try (BufferedWriter writer = new BufferedWriter(new FileWriter(dsa))) {

         	
             // Escribo la estructura
         	String estructura, dades;
     		estructura =  "";
     		
             for (int j = 0; j < length; j++) {
                 estructura += nom[j * registres] + ",";                        
             }
             
         	writer.write("  CREATE TABLE IF NOT EXISTS " + "persones" + " (" + estructura + ");");
  	        writer.newLine();
  	        
         	for (int i = 0; i < registres; i++) {
         		estructura =  "";
         		dades = "";
                 for (int j = 0; j < length; j++) {
                     estructura += nom[i + (j * registres)] + ",";
                     dades += resultat[i + (j * registres)] + ",";
                     
                 }
                 StringBuilder valores = new StringBuilder();
                 for (String valor : dades.split(",")) {
 	                // Agregar comillas simples a todos los valores excepto si parecen números
 	                try {
 	                    Double.parseDouble(valor); // Intentar convertir a número
 	                    valores.append(valor); // Si es un número, no agregar comillas
 	                } catch (NumberFormatException e) {
 	                    valores.append("'").append(valor).append("'"); // Si no, agregar comillas
 	                }
 	                valores.append(", ");
 	            }
                 writer.write("INSERT INTO " + "persones" + " (" + estructura + ") VALUES (" + valores + ");");
 	            writer.newLine();
             }
            

             

                 
             
             writer.newLine();

             writer.flush();

             System.out.println("Tabla Creada");

         } catch (Exception e) {

             e.printStackTrace();

         }
    	

    	
    	
    }
    
    
    
    
    
    
    
    
    
    private static String mails(int opcio1, int opcio2) {
        // Lista de nombres y apellidos
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Carmen", "José", "Laura", "Francisco", "Marta"};
        String[] apellidos = {"García", "Martínez", "López", "Hernández", "González", "Rodríguez", "Pérez", "Sánchez", "Ramírez", "Torres"};
        String[] correos = {"@cloudflare.com", "@gmail.com", "@yahoo.com", "@outlook.com", "@hotmail.com", "@example.com", "@protonmail.com", "@zoho.com", "@icloud.com", "@mail.com"};

        // Variables para la empresa y la extensión
        String Empresa = "Noms de companyia"; // Valor por defecto
        //String Extension = ".com";           // Valor por defecto

        // Escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("¿Desea personalizar el nombre de la empresa? (sí/no): ");
        String respuestaEmpresa = opcio1+"";

        if (respuestaEmpresa.equalsIgnoreCase("sí")) {
            System.out.println("Ingrese el nombre de la empresa: ");
            Empresa = scanner.nextLine();
        }

       // System.out.println("¿Desea personalizar la extensión del dominio? (sí/no): ");
        String respuestaExtension = opcio2+"";

        /*if (respuestaExtension.equalsIgnoreCase("sí")) {
            System.out.println("Ingrese la extensión del dominio (por ejemplo, '.net', '.org', etc.): ");
            Extension = scanner.nextLine();
        }*/

        // Random para seleccionar nombres y apellidos
        Random random = new Random();

        // Generar y mostrar correos electrónicos
        System.out.println("\nCorreos generados:");
        
        String nombre = nombres[random.nextInt(nombres.length)];
        String apellido = apellidos[random.nextInt(apellidos.length)];
        String dominio = correos[random.nextInt(correos.length)];

        // Formar la dirección de correo
        String email = (nombre.toLowerCase() + "." + apellido.toLowerCase() + dominio)
                .replace(" ", ""); // Eliminar espacios en blanco
        scanner.close();
        return email;
    

        

    }
}


