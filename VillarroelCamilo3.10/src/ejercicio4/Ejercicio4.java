/*
 *Descripción: Solicitar datos en un array y calcular la suma de los positivos y negativos.
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[20];

		int positivos = 0, negativos = 0;

		for (int i = 0; i < 20; i++) {

			System.out.print("Introduzca el valor " + i + " del array: ");
			numeros[i] = teclado.nextInt();

			if (numeros[i] > 0) {
				positivos = positivos + numeros[i];
			} else {
				negativos = negativos + numeros[i];
			}
		}

		System.out.println(
				"La suma de los numeros positivos da " + positivos + ". Y la de los negativos da " + negativos);
	}

}
