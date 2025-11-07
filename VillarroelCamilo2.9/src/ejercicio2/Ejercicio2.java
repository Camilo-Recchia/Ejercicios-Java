/*
 *Descripción: Mostrar primeros 200 numeros naturales de 2 en 2
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		for (int contador = 0; contador < 200; contador = contador + 2) {

			numero++;
			System.out.print(" " + numero);
			numero++;
			System.out.print(" " + numero);
		}
	}

}
