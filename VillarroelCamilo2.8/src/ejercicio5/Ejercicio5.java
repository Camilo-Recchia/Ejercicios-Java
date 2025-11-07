/*
 *Descripción: Calculo Media numeros con un for
 *Autor: Camilo Villarroel Recchia
 *Fecha: 16/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0, contadorPositivo = 0, contadorNegativo = 0, nulo = 0;
		double positivo = 0, negativo = 0;
		System.out
				.println("Introduzca 10 numeros, positivos, nulos o negativos. Luego se hara la media de cada uno.\n");

		for (int contador = 0; contador <= 9; contador++) {

			System.out.print("Numero: ");
			numero = teclado.nextInt();
			if (numero > 0) {
				positivo = positivo + numero;
				contadorPositivo++;

			} else if (numero < 0) {
				negativo = negativo + numero;
				contadorNegativo++;
			} else {
				nulo++;
			}
		}

		System.out.print("La media de los numeros positivos es " + positivo / contadorPositivo
				+ ", la media de los numeros negativos es " + negativo / contadorNegativo + " y se han introducido "
				+ nulo + " ceros");

	}
}
