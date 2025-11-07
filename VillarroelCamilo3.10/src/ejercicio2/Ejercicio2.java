/*
 *Descripción: Solicitar y mostrar la suma de valores en un array
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[10];

		int suma = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Introduzca el valor " + i + " del array: ");
			numeros[i] = teclado.nextInt();

			suma = suma + numeros[i]; // Variable para almacenar los valores del array "numeros"
		}

		System.out.println("La suma de todos los valores del array es de " + suma);

	}

}
