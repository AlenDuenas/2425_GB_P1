import java.util.Random;
import java.math.BigInteger;
public class IBAN {
	
	public static void main(String[] args) {
               System.out.println(GenerarIban()); 
	}
	/**
	 * Genera un IBAN aleatori per a un país seleccionat aleatòriament.
	 * 
	 * Aquesta funció crea un IBAN que consisteix en:
	 * - Un codi de control (CC) inicialitzat a "00".
	 * - Un número aleatori (KK) per a la validació.
	 * - Un codi de banc (BBBB) seleccionat aleatòriament d'un array.
	 * - Un codi de sucursal (GGGG) generat aleatòriament.
	 * - Un número de compte (NNNN) generat aleatòriament.
	 * 
	 * A més, la funció calcula el codi de control correcte per a l'IBAN 
	 * 
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
}  
