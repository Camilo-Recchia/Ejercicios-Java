package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 1, negativos = 0, positivos = 0;
		System.out.println("Sumatorio de numeros negativos y positivos\n");
		for (int contador = 1; contador <= 10; contador++) {
			if (numero != 0) {
				System.out.print("	Numeroº" + contador + ": ");
				numero = teclado.nextInt();

				if (numero < 0) {
					negativos = negativos + numero;
				} else {
					positivos = positivos + numero;
				}
				
			} else {
				System.out.print("Ese numero no es valido, inserte otro: ");
				numero = teclado.nextInt();
				
				while (numero == 0) {
					System.out.print("Ese numero no es valido, inserte otro: ");
					numero = teclado.nextInt();
				}
			}
		}
		System.out.println("En total los numeros positivos suman "+positivos+". Y los negativos sumaron "+negativos);
	}
}
