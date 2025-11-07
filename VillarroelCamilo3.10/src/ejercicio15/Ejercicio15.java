/*
 *Descripción: Guradar datos en un vector
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/10/2025
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n, m;

		System.out.print("Indica la cantidad de datos que quiere guardar: ");
		n = teclado.nextInt();

		int[] numeros = new int[n];

		System.out.print("Indique el valor que quiere guardar: ");
		m = teclado.nextInt();

		Arrays.fill(numeros, m);

		System.out.println("Sus datos guardados se ven así: \n");

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("dato" + i + ": " + numeros[i]);
		}

	}

}
