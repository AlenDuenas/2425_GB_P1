import java.io.*;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class MenuNou {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner teclat = new Scanner(System.in);


        String [] lectura = OpcionsCamp0 (teclat); //Opcions de l'arxiu d'entrada

        funcions (lectura);

/*for (int i=0;i<opcions.length;i++)
{
System.out.println(opcions[i]);
}*/


/*try {

//Tipus de file fileReader per llegir-lo
FileReader fr = new FileReader("C:\\Users\\arnau\\Desktop\\Mo.txt"); //Posem ruta d'arxiu per llegir
BufferedReader br = new BufferedReader(fr); //Serveix per llegir


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
                    if (Integer.parseInt(separo[0]) > 0 && Integer.parseInt(separo[0]) < 10) //Començem comprovar els camp del 1 al 10
                    {
                        if (separo.length!=2) //Si el camp senser te mes camps del que toca error
                        {
                            System.out.println("Error en la linia "+i);
                            compleix=false;
                        }

                        else if (separo[0] == null || separo [1] == null) //Si un dels dos camps es null error
                        {
                            System.out.println("Error en la linia "+i);
                            compleix=false;
                        }


                    }

                    if (Integer.parseInt(separo[0])>10 && Integer.parseInt(separo[0])<20)
                    {


                        if (separo[0] == null || separo [1] == null) //Si un dels dos camps es null error
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

                            } //System.out.println("Holaxx");

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
                                    contrasenyaLletres = ""; //Reinicialitzem
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



          lector.readLine(); //Passo de la primera linia

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

            //Leo si es xml o sql y llamo a la funcion pertinente para generar la salida
            String[] salida = linea.split("#");
            if(salida[0].equals("SQL")){

            }


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

            File arxiu = new File("Mo.txt");

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
                    guardo[k] = linea; //Guardo totes les linies en un array per despres, més endavant tractar-les
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
separo=arxius[i].getName().split("\\."); //Separem els arxius per . per a que no agafi l'extensio
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
        String contrasenya = ""; //Aqui guardarem la contrasenya generada


        //Fem un bucle de la longitut de que ens ha passat l'usuari
        for (int i = 0; i < longitut; i++)
        {
            int indexAleatori = random.nextInt(caracters.length()); //Crrem el random a partir de la longitut de l'String de caracters per seleccionar la posicio aleatoria
            contrasenya += caracters.charAt(indexAleatori); // Acumulem cada lletra a el nou String
        }

        return contrasenya;



    }

    public static String numeros (int longitut) {
        String numeros = "123456789"; //Creem un String amb tots els numeros del 1 - 9
        Random random = new Random(); //Instanciem el aleatori
        String contrasenyaNumeros = ""; //Guardarem la contrasenya generada per numeros aqui a aquest String

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
        String majuscules = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Creem un String amb totes les lletres del abecedari amb majuscules
        Random random = new Random(); //Instanciem un Random
        String contrasenyaMajuscules = ""; //Guardarem la contrasenya generada aqui

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
        String simbols = "!ºª&()#*+-¿?=¬~¨[ ]"; //Creem un String amb varis signes que Java accepti
        Random random = new Random(); //Instanciem un Random
        String contrasenyaSimbols = ""; //Creem un nou String per guardar la contrasenya generada

        //Creem un bucle per poder generar la contrasenya a partir de la longitut que ens han passat
        for (int i = 0; i < longitut; i++)
        {
            //Generem el numero aleatori a partir de la longitut de l'String simbols
            int indexAleatori = random.nextInt(simbols.length());
            contrasenyaSimbols += simbols.charAt(indexAleatori); //ho guardem  a el nou String
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

    /**
     * Funcio que conta a partir d'un numero x
     * @param numLineas
     */
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

    /**
     * Funcio que retorna true o false de forma aleatoria
     * @return
     */
    public static String bolean() {
        Random random = new Random();
        int num = random.nextInt(2);
        String a = "";
        if (num ==1) {a = "true";}
        if (num == 0) {a = "false";}

        //System.out.println(a);
        return a;
    }

    /**
     * Funcio que genera un DNI valid y el retorna
     * @return
     */
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

    /**
     * Funcio que genera per separat els distints blocs d'un iban i retorna un iban si es valid
     * @return
     */
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

    /**
     * Funcio que genera numeros aleatoris fins al 255 i els junta en una ip
     * @return
     */
    public static String ip() {
        Random random = new Random();
        int num = random.nextInt(256);
        int num2 = random.nextInt(256);
        int num3 = random.nextInt(256);
        int num4 = random.nextInt(256);
        //System.out.println(num + "." + num2 + "." + num3 + "." + num4);
        return num + "." + num2 + "." + num3 + "." + num4;

    }

    /**
     * funcio que genera noms llegint un fitxer i agafant llinies aleatories
     * @return
     */
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

    /**
     * Genera un cognom aleatori agafant una llinia aleatoria del arxiu
     * @return
     */
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

    /**
     * Agafa totes les ciutats d'un arxiu i aleatoriament selecciona una
     * @return
     */
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

    /**
     * Llegeix un arxiu i agafa aleatoriament una llinia
     * @return
     */
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

    /**
     * Llegeix un arxiu i agafa aleatoriament una llinia
     * @return
     */
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

    /**
     * Llegeix un arxiu i agafa aleatoriament una llinia
     * @return
     */
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

    /**
     * Llegeix un arxiu i agafa aleatoriament una llinia
     * @return
     */
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

    /**
     * Llegeix un arxiu i agafa aleatoriament una llinia
     * @return
     */
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

    /**
     * Llegeix un arxiu i agafa aleatoriament una llinia
     * @return
     */
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
    public static void insert(String[] estructura, String[] insert, String tabla, File archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            // Convertir arrays a cadenas separadas por comas
            String estructuraStr = String.join(", ", estructura);
            String insertStr = String.join(", ", insert);

            // Escribir la sentencia SQL
            writer.write("CREATE TABLE " + tabla + " (" + estructuraStr + ");");
            writer.write("INSERT INTO " + tabla + " (" + estructuraStr + ") VALUES (" + insertStr + ");");
            writer.newLine();
            writer.flush(); // Asegurar que los datos se escriban en el archivo
            System.out.println("SQL escrito en el archivo correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
