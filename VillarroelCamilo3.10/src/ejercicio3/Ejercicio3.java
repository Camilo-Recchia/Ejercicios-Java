/*
 *Descripción: Localizar el valor mayor de un array
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[10];

		int mayor = 0, contador = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Introduzca el valor " + i + " del array: ");
			numeros[i] = teclado.nextInt();

			if (numeros[i] > mayor) {
				mayor = numeros[i];
				contador = i;
			}
		}

		System.out.println("El valor más alto del array es el " + contador + " con un valor de " + mayor);
	}

}
