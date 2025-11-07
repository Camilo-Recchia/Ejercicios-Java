/*
 *Descripción: Contador de numeros hasta N
 *Autor: Camilo Villarroel Recchia
 *Fecha: 17/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.print("Introduzca hasta que numero quieres que cuente: ");
		numero = teclado.nextInt();
		System.out.println("");

		for (int contador = 1; contador <= numero; contador++) {

			System.out.print(contador + " ");
		}
	}

}
