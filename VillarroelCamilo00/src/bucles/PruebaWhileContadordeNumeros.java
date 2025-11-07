package bucles;

import java.util.Scanner;

public class PruebaWhileContadordeNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int inicio, finale;

		System.out.print("Introduzca el inicio: ");
		inicio = teclado.nextInt();
		System.out.print("Introduzca el final: ");
		finale = teclado.nextInt();

		if (inicio < finale) {
			System.out.println("\nSecuencia de numeros de " + inicio + " a " + finale + "\n");

			while (inicio != finale + 1) {
				System.out.print(inicio + " ");
				inicio++;
			}

		} else {

			System.out.println("\nSecuencia de numeros de " + inicio + " a " + finale + "\n");
			while (inicio != finale - 1) {
				System.out.print(+inicio + " ");
				inicio--;
			}

			teclado.close();
		}
	}

}
