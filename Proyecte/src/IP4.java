import java.util.Random;
/**
 * 
 */
public class IP4 {

	public static void main(String[] args) {

	}
	
	/**
	 * Genera una adreça IP en format IPv4 aleatòria i la imprimeix a la consola.
	 * 
	 * Aquesta funció genera quatre números aleatoris entre 0 i 255, que representen
	 * les quatre parts d'una adreça IPv4.
	 */
	public void IPV4(){
	Random random = new Random();
	int num = random.nextInt(256);
	int num2 = random.nextInt(256);
	int num3 = random.nextInt(256);
	int num4 = random.nextInt(256);
	System.out.println(num + "." + num2 + "." + num3 + "." + num4);
	}

}
