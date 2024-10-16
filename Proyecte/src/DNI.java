import java.util.Random;

public class DNI {
    private String dni;
    public DNI() {
        Random random = new Random();
        int numero = 10000000 + random.nextInt(90000000);
        //Posicion letra
        int posicion = numero % 23;

        // Array con letras de dni
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
                           "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
                           "C", "K", "E"};
        // Formar el DNI completo
        this.dni = String.valueOf(numero) + letras[posicion];
    }

    public String getDNI() {
        return this.dni;
    }
}
