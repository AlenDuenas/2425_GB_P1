import java.util.Random;
public class IP4 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(256);
		int num2 = random.nextInt(256);
		int num3 = random.nextInt(256);
		int num4 = random.nextInt(256);
		System.out.println(num + "." + num2 + "." + num3 + "." + num4);

	}

}
