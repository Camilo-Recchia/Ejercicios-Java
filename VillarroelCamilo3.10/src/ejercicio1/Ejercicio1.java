/*
 *Descripción: Solicitar y mostrar valores en un array
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {

			System.out.print("Introduzca el valor " + i + " del array: ");
			numeros[i] = teclado.nextInt();

		}
		System.out.println("");
		for (int i = 0; i < 10; i++) {

			System.out.println("El dato del valor " + i + " es: " + numeros[i]);
		}
	}

}
