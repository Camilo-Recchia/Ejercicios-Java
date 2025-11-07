/*
 *Descripción: Juego de Adivinar el numero con un while
 *Autor: Camilo Villarroel Recchia
 *Fecha: 16/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double numero = Math.random() * 50;

		int numero2 = (int) numero, intento = 0;

		System.out.println("Adivina el numero entre 0 y 50.");
		System.out.print("Numero: ");
		intento = teclado.nextInt();

		while (intento != numero2) {
			if (intento > numero) {
				System.out.println("El numero es más chico");
				System.out.print("Numero: ");
				intento = teclado.nextInt();
			} else {
				System.out.println("El numero es más grande");
				System.out.print("Numero: ");
				intento = teclado.nextInt();

			}
		}
		System.out.println("Felicidades, el numero era " + numero2);
	}

}
