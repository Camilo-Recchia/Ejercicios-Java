/*
 *Descripción: Datos en un array bidimencional
 *Autor: Camilo Villarroel Recchia
 *Fecha: 12/11/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contador = 0;

		final int FILA = 3, COLUMNA = 10; // Constantes de tamaño de variable

		int[][] matriz = new int[FILA][COLUMNA];

		for (int i = 0; i < FILA; i++) { // Bucle de valores del array

			for (int j = 0; j < COLUMNA; j++) {
				matriz[i][j] = (int) (Math.random() * 300);
			}
		}

		for (int i = 0; i < FILA; i++) { // Bucle para mostrar el array
			System.out.println("");
			for (int j = 0; j < COLUMNA; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}

		System.out.println("\n\nAhora voy a buscar todos los valores menores al valor indicado.");
		System.out.print("Valor: ");
		int valorMenor = teclado.nextInt();
		while (valorMenor > 300 || valorMenor < 0) {
			System.out.println("Ese valor no es valido inserte otro por favor.");
			System.out.print("Valor:");
			valorMenor = teclado.nextInt();
		}

		for (int i = 0; i < FILA; i++) { // Bucle para mostrar numeros menores a valorMenor

			for (int j = 0; j < COLUMNA; j++) {
				
				int comparador = matriz[i][j];
				
				if (comparador < valorMenor) {
					System.out.println("El valor " + comparador + " es menor que " + valorMenor
							+ ", y se encuentra en la posicion (" + i + "," + j + ")");
				}
			}
		}

		System.out.println("\n\nAhora introduzca dos posiciones.");
		System.out.println("Y mostrare todos los valores impares entre ellos.");

		System.out.print("Posicion 1: ");
		int x = teclado.nextInt();

		System.out.print("Posicion 2: ");
		int y = teclado.nextInt();

		for (int i = 0; i < FILA; i++) { // Bucle para mostrar los valores impares en
			for (int j = x; j < y; j++) {
				int impar = matriz[i][j] % 2;

				if (impar != 0) {
					System.out.print("\n" + matriz[i][j] + " ");
					contador++;
				}

			}

		}
		if (contador == 0) {
			System.out.println("No se ha encontrado ningun numero impar dentro de esas posiciones.");
		}

	}
}
