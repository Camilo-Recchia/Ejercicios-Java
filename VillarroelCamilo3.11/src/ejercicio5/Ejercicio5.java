/*
 *Descripción: Experimento Brecha Salarial 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 31/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int size, mediaHombres = 0, mediaMujeres = 0, contadorHombres = 0, contadorMujeres = 0;

		String generos = "Hombre";
		
		System.out.println("		Experimento Brecha Salarial\n	----------------------------");

		System.out.print("\nIntroduzca el numero de sujetos que van a participar el en experimento: ");
		size = teclado.nextInt();

		int[][] personas = new int[size][2];

		for (int genero = 0; genero < size; genero++) {

			System.out.println("");
			for (int sueldo = 1; sueldo < 2; sueldo++) {

				System.out.print("Diga si el sujero " + (genero + 1) + " es V o M. |0 = V|1 = M|: ");
				personas[genero][0] = teclado.nextInt();

				while (personas[genero][0] != 0 && personas[genero][0] != 1) {

					System.out.print("Ese no es un genero valido. Inserte uno valido: ");
					personas[genero][0] = teclado.nextInt();

				}

				if (personas[genero][0] == 0) {

					generos = "del Hombre";

				} else {

					generos = "de la Mujer";
				}

				System.out.print("Indique el sueldo " + generos + ": ");
				personas[genero][sueldo] = teclado.nextInt();

			}
		}

		for (int genero = 0; genero < size; genero++) {

			for (int sueldo = 0; sueldo < 1; sueldo++) {

				if (personas[genero][0] == 0) {

					mediaHombres = mediaHombres + personas[genero][1];
					contadorHombres++;

				} else {

					mediaMujeres = mediaMujeres + personas[genero][1];
					contadorMujeres++;

				}

			}

		}
		mediaHombres = mediaHombres / contadorHombres;
		mediaMujeres = mediaMujeres / contadorMujeres;

		System.out.println("\nEl sueldo medio de los hombres es " + mediaHombres + "€");
		System.out.print("El sueldo medio de los mujeres es " + mediaMujeres + "€");
	}
}
