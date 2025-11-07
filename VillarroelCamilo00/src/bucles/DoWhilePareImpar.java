package bucles;
import java.util.Scanner;
public class DoWhilePareImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int par;
		
		System.out.print("Introduzca un numero par: ");
		par = teclado.nextInt();
		
		do {
			par = teclado.nextInt();
			
		}while(par%2 !=0);
	
	System.out.print("Gracias por su colaboración.");
	
	}
	

}
