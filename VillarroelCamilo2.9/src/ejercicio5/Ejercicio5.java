/*
 *Descripción: Calculador de Factorial (N!)
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero, factorial = 0;

		System.out.print("Introduce el numero del que quieres saber su factorial: ");
		numero = teclado.nextInt();

		factorial = numero;

		if (numero > 0) {

			for (int contador = 1; contador < numero; contador++) {
				factorial = factorial * (numero - contador);
			}

		} else {
			factorial = 1;
		}

		System.out.print("Su factorial es " + factorial);
	}

}
