/*
 *Descripción: Contador de numeros positivos, hasta que se introduce un cero, con un bucle while
 *Autor: Camilo Villarroel Recchia
 *Fecha: 14/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0, contador = 0, almacen;
		double media;

		System.out.print(
				"Intorduzca todos los valores positivos que quiera, cuando introduzca un cero el programa se detendra y le dira la media: ");
		numero = teclado.nextInt();
		almacen = numero;
		if (numero >= 0) {
			while (numero != 0) {

				System.out.print("\nNumero: ");
				numero = teclado.nextInt();
				almacen = almacen + numero;
				contador++;
			}

		} else {
			System.out.println("Solo numeros positivos o cero. ERROR");
			System.exit(0);
		}
		media = (double) almacen / contador;
		System.out.print("\nSe introdujeron " + contador
				+ " numeros mayores a cero. Y la media de los numeros introducidos es " + media);

	}

}
