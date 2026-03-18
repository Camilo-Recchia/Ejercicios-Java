/*
 *Descripción: Dibujo de piramide
 *Autor: Camilo Villarroel Recchia
 *Fecha: 18/11/2025
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime la cantidad de filas del triangulo: ");
		int a = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Dime el caracter del que va a estar hacha el triangulo: ");
		String b = teclado.nextLine();

		piramide(a, b);
	}

	public static void piramide(int a, String b) {

		int contador;

		for (int i = 0; i <= a; i++) {

			contador = ((i * 2) - 1);
			System.out.println();
			int medidor = i;
			while (medidor != a) {
				System.out.print(" ");
				medidor++;
			}

			for (int j = 0; j < contador; j++) {

				System.out.print(b);
			}
		}

	}

}
