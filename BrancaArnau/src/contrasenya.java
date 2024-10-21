import java.util.Scanner;

public class contrasenya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat=new Scanner (System.in);
		
		
		
		

	}
	
	public static void menu () {
		System.out.println("Entri siusplau els següents parametres per poder generar-li la contrasenya ------->");
	}
	 

	public static int[] opcions(Scanner teclat) {
		boolean condicio= true;
		int opcions [] = new int [6];

		
		while (condicio)
		{
			System.out.println("Entri si vol lletres  1. SI / 2 NO:");
			int opcioLletres = teclat.nextInt();
			
			if (opcioLletres != 1 || opcioLletres != 2)
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
			System.out.println("Entri si vol numeros  1. SI / 2 NO:");
			int opcioNumeros = teclat.nextInt();
			
			if (opcioNumeros != 1 || opcioNumeros != 2)
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
			System.out.println("Entri si vol majuscules  1. SI / 2 NO:");
			int opcioMajuscules = teclat.nextInt();
			
			if (opcioMajuscules != 1 || opcioMajuscules != 2)
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
			System.out.println("Entri si vol minuscules  1. SI / 2 NO:");
			int opcioMinuscules = teclat.nextInt();
			
			if (opcioMinuscules != 1 || opcioMinuscules != 2)
			{
				System.out.println("OPCIO NO VALIDA TORNI A ENTRAR SI VOL MINUSCULES O NO");
			}
			
			else 
			{
				opcions[3]=opcioMinuscules;
				condicio=false;
			}
		}
		condicio = true;
		
		
		while (condicio)
		{
			System.out.println("Entri si vol simbols  1. SI / 2 NO:");
			int opcioSimbols = teclat.nextInt();
			
			if (opcioSimbols != 1 || opcioSimbols != 2)
			{
				System.out.println("OPCIO NO VALIDA TORNI A ENTRAR SI VOL SIMBOLS O NO");
			}
			
			else 
			{
				opcions[4]=opcioSimbols;
				condicio=false;
			}
		}
		condicio = true;
		
		
		while (condicio)
		{
			System.out.println("Entri si vol simbols  1. SI / 2 NO:");
			int opcioLongitut = teclat.nextInt();
			
			if (opcioLongitut < 3)
			{
				System.out.println("CONTRASENYA MOLT POC SEGURA POSI UNA LONGITUT MES GRAN DE 4");
			}
			
			else 
			{
				opcions[5]=opcioLongitut;
				condicio=false;
			}
		}
			
		
		return opcions;
	}
	
	

}
