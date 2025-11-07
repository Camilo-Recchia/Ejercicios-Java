package ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
		double fahrenheit,celsius;
		
		System.out.print("Introduzca la cantidad de grados Fahrenheit que quiera transformar: ");
		fahrenheit = teclado.nextInt();
	
		celsius = (fahrenheit-32)/1.8;
		
		System.out.print("\n\nEsos grados en celsius son "+celsius+"ºC");
		
	}

}
