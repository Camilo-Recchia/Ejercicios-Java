/*
 *Descripción: Detector de numeros negativos.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 1;

		String cuestion = "No";

		for (int contador = 1; contador <= 100; contador++) {
			if (numero != 0) {
				System.out.print("Numeroº" + contador + ": ");
				numero = teclado.nextInt();

				if (numero < 0)
					cuestion = "Si";
			} else {
				System.out.print("Ese numero no es valido, inserte otro: ");
				numero = teclado.nextInt();
				while (numero == 0) {
					System.out.print("Ese numero no es valido, inserte otro: ");
					numero = teclado.nextInt();

				}
			}
		}
		System.out.print(cuestion + " se ha encontrado un numero negativo entre los 100");
	}

}
