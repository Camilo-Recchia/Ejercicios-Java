/*
 *Descripción: Mostrar primeros 20 numeros naturales 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("	  Primeros 20 numeros reales.\n");

		for (int contador = 0; contador < 20; contador++) {

			numero++;
			System.out.print(" " + numero);
		}
	}

}
