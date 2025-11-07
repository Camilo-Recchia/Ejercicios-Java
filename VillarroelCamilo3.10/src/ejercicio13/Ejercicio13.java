/*
 *Descripción: Secuencia aritmetica
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Inicializanos las variables para el temaño del array, el valor inicial de la
		// secuencia y su aumento
		int size, I, V;

		System.out.print("Indica la cantidad de datos quieres guradar de la secuencia aritmetica: ");
		size = teclado.nextInt();
		System.out.print("Introduzca el valor inicial de la secuencia: ");
		I = teclado.nextInt();
		System.out.print("Introduzca el valor del incremento de la secuencia: ");
		V = teclado.nextInt();

		int[] numeros = new int[size];

		// Guardo afuera del bucle el primer dato porque por culpa de la linea 31 se guardaria mal.
		numeros[0] = I;

		for (int i = 1; i < size; i++) {

			// Formula para calcular la secuencia
			numeros[i] = I + V;
			I = I + V;

		}

		System.out.print("\nLa secuencia final es: ");

		for (int i = 0; i < size; i++) {

			System.out.print(numeros[i] + " ");
		}

	}

}
