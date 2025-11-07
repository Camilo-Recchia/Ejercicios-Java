/*
 *Descripción: Tablas de Multiplicar
 *Autor: Camilo Villarroel Recchia
 *Fecha: 05/11/2025
 */
package ada;

import java.util.Scanner;

public class EjercicioTablas04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dime el tamaño de los lados del cuadrado: ");
		int lado = teclado.nextInt();

		for (int i = 0; i < lado; i++) {

			System.out.print(" * ");

			for (int j = 0; j <= lado; j++) {

				System.out.print(" * ");

			}
			System.err.println("");
		}

	}

}
