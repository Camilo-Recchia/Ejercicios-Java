package bucles;
import java.util.Scanner;
public class PruebaWhileReal {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int numero = 1;
		
		while(numero<=500) {
			
			System.out.println(numero);
			numero++;
		
			teclado.close();
		}
		
	}

}
