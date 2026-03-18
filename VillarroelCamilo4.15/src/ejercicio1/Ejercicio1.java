/*
 *Descripción: Comprobador de nombres
 *Autor: Camilo Villarroel Recchia
 *Fecha: 19/11/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nom1, nom2;

		System.out.print("Por favot introduzca el nombre nº1: ");
		nom1 = teclado.nextLine();
		System.out.print("Por favot introduzca el nombre nº2: ");
		nom2 = teclado.nextLine();

		if (comprobadorNombre(nom1, nom2) == true) {
			System.out.println("Los nombres son iguales.");
		} else {
			System.out.println("Los nombres no son iguales.");
		}
	}

	// MEtodo que comprube si dos nombres son iguales //

	public static boolean comprobadorNombre(String nom1, String nom2) {

		boolean comprobador;

		if (nom1.equalsIgnoreCase(nom2)) {
			comprobador = true;
		} else {
			comprobador = false;
		}

		return comprobador;
	}

}
