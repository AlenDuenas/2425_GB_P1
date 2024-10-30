import java.util.Random;

public class DNI {
    private String dni;

    /**
     * Constructor de la classe DNI.
     * Aquest constructor genera un número de DNI aleatori que consisteix en 
     * un número de 8 dígits (entre 10000000 i 99999999) i una lletra de 
     * control que es genera fent una divisio entre 23 i el numero de 8
     * digits, el resultat es fara anar a l'array de lletres
     */

    public void DNI() {
        Random random = new Random();
        int numero = 10000000 + random.nextInt(90000000);
        // Posició lletra
        int posicion = numero % 23;

        // Array amb les lletres del DNI
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
                           "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
                           "C", "K", "E"};
        // Formar el DNI complet
        this.dni = String.valueOf(numero) + letras[posicion];
    }

}
