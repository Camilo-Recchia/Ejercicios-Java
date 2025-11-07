package bucles;
import java.util.Scanner;
public class PruebaWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int java;
		
		System.out.println("Estoy pensando un numero del 1 al 10. Adivinalo");
		java = teclado.nextInt();
		
		if (java>10 || java<=0) {
		System.out.print("Sos tonto?? Ese numero no está entre el 1 y el 10, salí de acá, tonto.");System.exit(0);
		
		}else {
		while(java!=10) {
			
		
			System.out.println("Ese no era, intentalo de nuevo");
			java = teclado.nextInt();
			
		
		
		}
		}
	}

}
