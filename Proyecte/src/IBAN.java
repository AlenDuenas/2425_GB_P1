import java.util.Random;
import java.math.BigInteger;
public class IBAN {
	
	public static void main(String[] args) {
                GenerarIban();
	}
	public void GenerarIban(){
		Random random = new Random();
		String CC = "00";
		int KK = random.nextInt(100);
		//Todos los arrays comparten posiciones 0182 es bbva, AL son 28 caracteres y 4 de sucursal.
		//Codigos de todos los bancos
        String[] BBBB = {
                "0182", "0049", "2100", "0081", "2038", "1465", "3058", "2103", "2095", "0075",
                "0128", "0073", "2105", "0239", "2048", "2080", "0019", "1450", "1465", "1491",
                "0186", "0260", "0089", "0275", "0030", "3100", "2108", "0019", "0216", "2085",
                "0093", "0154", "0232", "0049", "0024", "3001", "3098", "2100", "2096", "2095",
                "3111", "0031", "2077", "0183", "0208", "0099", "0244", "0182", "0030", "0267"
            };

            // Array de nombres de bancos
        	//No es necesario para codigo
            String[] nombresBancos = {
                "BBVA", "Banco Santander", "CaixaBank", "Banco Sabadell", "Bankia", "ING España", "Cajamar", "Unicaja Banco", "Kutxabank", "Banco Popular",
                "Bankinter", "Openbank", "Banco Castilla-La Mancha", "EVO Banco", "Liberbank", "Abanca", "Deutsche Bank", "Triodos Bank", "ING España", "Triodos Bank NV",
                "Banco de Crédito Local", "Banco Caixa Geral", "Banco de Galicia", "ING Bank NV", "Banesto", "Caja Rural de Almería", "Banco Caminos", "Deutsche Bank", "TargoBank", "Ibercaja Banco",
                "Banco Etcheverría", "Banco Banif", "Bankia", "Banco Santander", "Cecabank", "Caja Rural de Almendralejo", "Caja Rural Central", "CaixaBank", "Caja de Ingenieros", "Kutxabank",
                "Caja Rural de Jaén", "Banco Comercial Español", "Caja Rural Central", "Banco de España", "BNP Paribas", "Banca Pueyo", "Banca March", "BBVA", "Banesto", "Banco Pastor"
            };
            //Array de las siglas de paises
            String[] ES = {
                    "AL", "AD", "AT", "AZ", "BH", "BE", "BA", "BR", "BG", "CR", 
                    "HR", "CY", "CZ", "DK", "DO", "EE", "FO", "FI", "FR", "GE",
                    "DE", "GI", "GR", "GL", "GT", "HU", "IS", "IE", "IL", "IT", 
                    "JO", "KZ", "XK", "KW", "LV", "LB", "LI", "LT", "LU", "MT", 
                    "MR", "MU", "MD", "MC", "ME", "NL", "NO", "PK", "PL", "PT", 
                    "RO", "SM", "SA", "RS", "SK", "SI", "ES", "SE", "CH", "TL", 
                    "TN", "TR", "UA", "AE", "GB", "VG"
                };

                // Array con el número de caracteres del IBAN para cada país
                int[] numCaracteres = {
                    28, 24, 20, 28, 22, 16, 20, 29, 22, 21, 
                    21, 28, 24, 18, 28, 20, 18, 18, 27, 22, 
                    22, 23, 27, 18, 28, 28, 26, 22, 23, 27, 
                    30, 20, 20, 30, 21, 28, 21, 20, 31, 27, 
                    27, 30, 24, 27, 18, 24, 28, 25, 24, 27, 
                    24, 27, 22, 20, 24, 22, 24, 21, 30, 24, 
                    26, 29, 28, 23, 22
                };
                //Array con la longitud del codigo de sucursal de cada pais
                int[] longitudesCodigosSucursal = {
                        4,  // Albania
                        4,  // Andorra
                        5,  // Austria
                        4,  // Azerbaiyán
                        4,  // Baréin
                        3,  // Bélgica
                        4,  // Bosnia y Herzegovina
                        4,  // Brasil
                        4,  // Bulgaria
                        4,  // Costa Rica
                        7,  // Croacia
                        5,  // Chipre
                        4,  // República Checa
                        4,  // Dinamarca
                        4,  // República Dominicana
                        2,  // Estonia
                        4,  // Islas Feroe
                        4,  // Finlandia
                        5,  // Francia
                        6,  // Georgia
                        8,  // Alemania
                        4,  // Gibraltar
                        7,  // Grecia
                        4,  // Groenlandia
                        4,  // Guatemala
                        4,  // Hungría
                        4,  // Islandia
                        4,  // Irlanda
                        4,  // Israel
                        5,  // Italia
                        6,  // Jordania
                        6,  // Kazajistán
                        4,  // Kosovo
                        2,  // Kuwait
                        2,  // Letonia
                        6,  // Líbano
                        7,  // Liechtenstein
                        4,  // Lituania
                        3,  // Luxemburgo
                        4,  // Malta
                        5,  // Mauritania
                        5,  // Mauricio
                        2,  // Moldavia
                        5,  // Mónaco
                        4,  // Montenegro
                        6,  // Países Bajos
                        6,  // Noruega
                        4,  // Pakistán
                        6,  // Polonia
                        4,  // Portugal
                        4,  // Rumanía
                        5,  // San Marino
                        4,  // Arabia Saudita
                        6,  // Serbia
                        6,  // Eslovaquia
                        4,  // Eslovenia
                        4,  // España
                        4,  // Suecia
                        5,  // Suiza
                        4,  // Timor Oriental
                        4,  // Túnez
                        4,  // Turquía
                        29, // Ucrania
                        3,  // Emiratos Árabes Unidos
                        6,  // Reino Unido
                        4   // Islas Vírgenes Británicas
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
                /*Creo NNNN, num y GGG 
                num = numero aleatorio para ver que posiciones de arrays pillo
                NNNN = numero de cuenta se generara mas adelante
                GGGG = Codigo de sucursal se genera justo debajo
                */
                String NNNN = "";
                int num = random.nextInt(50);
                String GGGG = "";
                //Para generar el codigo de sucursal
                for (int i = 0; i <= longitudesCodigosSucursal[num]; i++) {
                	GGGG = GGGG + random.nextInt(10) + "";
                }
                numCaracteres[num]  = numCaracteres[num] - 2 - 4 - 4 - longitudesCodigosSucursal[num];

                for (int i = 0; i < numCaracteres[num]; i++) {
                	NNNN = NNNN + random.nextInt(10) + "";
                }
                //Imprimir IBAN (se puede hacer sin la variable IBAN pero puede ser util tenerlo asi)

                String temporal = NNNN + KK +  BBBB[num] + GGGG + codPais[num] + CC;
                /*Paso el String temporal a un BigInteger para tener la concatenacion entera como un numero
                  Como no puedo usar el % y el .mod(97) tampoco creo otro big int para la division de 97
                  Necesito crear un bigint por cada operacion que quiera hacer
                */
                BigInteger asd = new BigInteger(temporal);
                BigInteger divisor = BigInteger.valueOf(97);
                BigInteger restador = BigInteger.valueOf(98);
                BigInteger uno = BigInteger.valueOf(1);
                asd = asd.mod(divisor);
                CC = restador.subtract(asd).toString();
                System.out.println(ES[num] +" "+ CC +" "+ BBBB[num] +" "+ GGGG +" "+ KK +" "+NNNN);
                temporal = NNNN + KK +  BBBB[num] + GGGG + codPais[num] + CC;
                System.out.println(temporal);
                asd = new BigInteger(temporal);
                asd = asd.mod(divisor);
                System.out.println(asd);
                if (asd != uno) {
                	GenerarIban();
                }

	}
	 }

