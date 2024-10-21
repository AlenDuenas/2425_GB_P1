import java.util.Random;
public class Boolean2 {

	
	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(2);  
		boolean a = false;
		if (num ==1) {a = true;}
		if (num == 0) {a = false;}

	System.out.println(a);
 
}
} 