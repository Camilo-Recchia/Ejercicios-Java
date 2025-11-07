package bucles;

import java.util.Scanner;

public class BucleForNumero3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int inicio, fin;

		System.out.print("Introduzca el inicio: ");
		inicio = teclado.nextInt();
		System.out.print("Introduzca el final: ");
		fin = teclado.nextInt();

		System.out.println("\nNumeros, de la secuencia del " + inicio + " al " + fin + "\n");

		for (int contador = inicio; contador <= fin; contador++) {
			System.out.println("Evaluando " + contador);

			if (contador % 3 == 0) {
				System.out.print("	" + contador + " es multiplo de 3\n");
			}
		}
	}

}
